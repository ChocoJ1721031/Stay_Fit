package kh.project.stayfit.member.controller;


import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.GsonBuilder;

import kh.project.stayfit.member.model.service.MemberMailService;
import kh.project.stayfit.member.model.service.MemberService;
import kh.project.stayfit.member.model.vo.Member;

@Controller
@RequestMapping("/member")
public class JoinController {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	MemberService memberService;
	@Autowired
	MemberMailService mailService;
	
	@GetMapping("/join")
	public ModelAndView join(ModelAndView mv) {
		
		mv.addObject("sectionName", "member/join.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	@PostMapping("/joinAction")
	public String join(
			HttpServletRequest request
			, @RequestParam(name="memail") String memail
			, @RequestParam(name="mname") String mname
			, @RequestParam(name="mpw") String mpw
			
			) {
		Member vo = new Member();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("memail : "+memail);
		System.out.println("mname : "+mname);
		System.out.println("mpw : "+mpw);
		
		
		vo.setMemail(memail);
		vo.setMname(mname);
		vo.setMpw(mpw);
		System.out.println("Controler Join");
		memberService.join(vo);
		return "redirect:/member/login";
	}
	
	@GetMapping("/pwfind")
	public ModelAndView pwfind(ModelAndView mv) {
		
		mv.addObject("sectionName", "member/pwfind.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	@PostMapping("/mailChk")
	@ResponseBody
	public int mailchk(@RequestParam("memail") String memail) {
		int result= memberService.mailChk(memail);
		return result; 
	}
	
	@PostMapping("/send")
	public void sendMail(HttpServletResponse response, @RequestParam(name="memail") String memail) {
		String result = null;
		int authNum;
		Random r = new Random();
		int cdNum = r.nextInt(888888) + 111111;
		System.out.println("???????????? : " + cdNum);
		authNum = cdNum;
		try {
			PrintWriter out = response.getWriter();
			try {
				SimpleMailMessage message = new SimpleMailMessage();
				message.setTo(memail);
				message.setSubject("?????? ?????? ?????? ????????? ?????????.");
				message.setText("??????????????? ?????????????????? ???????????????.\n \n" +
						"?????? ????????? " + authNum + " ?????????. \n \n" + 
						"?????? ??????????????? ???????????? ???????????? ???????????? ?????????.");
				mailSender.send(message);
				result = Integer.toString(authNum);
			} catch (Exception e) {
				result = "fail";
			}
			out.append(new GsonBuilder().create().toJson(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : "+result);
	}
	@GetMapping("/codechk")
	public ModelAndView codechk(ModelAndView mv) {
		
		mv.addObject("sectionName", "????????????.jsp");
		mv.setViewName("index");
		
		return mv;
	}
}
