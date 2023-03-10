package kh.project.stayfit.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.project.stayfit.member.model.service.MemberService;
import kh.project.stayfit.member.model.vo.Member;


@Controller
@RequestMapping("/member")
public class LoginController {
	
	@Autowired
	MemberService memberService;
	
	//로그인 화면
	@GetMapping("/login")
	public ModelAndView login(ModelAndView mv, HttpSession session, HttpServletRequest request) {
		int mid = -1;
		if(request.getSession().getAttribute("mid") != null) {
			mid = (int) request.getSession().getAttribute("mid");
		}
		
		if(mid == -1) {
			mv.addObject("sectionName", "member/login.jsp");
			mv.setViewName("index");
		} else {
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView loginCheck(@ModelAttribute Member member, HttpSession session) {
		boolean result = memberService.loginCheck(member, session);
		ModelAndView mv = new ModelAndView();
		if(result == true) { //로그인 성공
			mv.setViewName("redirect:/");	
		}else { 			//로그인 실패
			mv.addObject("func", "loginFail");
			mv.addObject("msg", "아이디 또는 비밀번호를 확인해주세요.");
			mv.setViewName("/member/resultAlert");
		}
		return mv;
	}
	
	@GetMapping("/naverlogin")
	public String naverLogin() {
		return "naverlogin";
	}
}
