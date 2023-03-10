package kh.project.stayfit.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import kh.project.stayfit.admin.model.service.AdminMemberService;
import kh.project.stayfit.admin.model.vo.AdminMember;

@Controller
@RequestMapping("/admin")
public class MemberController {
	
	@Autowired
	private AdminMemberService service;
	
	
	@GetMapping("/member")
	public ModelAndView member(ModelAndView mv, HttpServletRequest request) throws Exception {
		
		// 로그인을 하지 않은 경우나 admin이 아닌 사용자가 url로 접근하는 것 막는 코드
		if(request.getSession().getAttribute("mrole") == null || !('A' == (char)request.getSession().getAttribute("mrole"))){
			mv.addObject("func", "adminLogin");
			mv.addObject("msg", "관리자만 접근 가능한 페이지입니다.");
			mv.setViewName("/admin/resultAlert");
		} else {
			mv.addObject("currentMenu", 2);
			mv.setViewName("/admin/member");
		}
		return mv;
	}
	
	// 목록 출력
	@GetMapping("/memberlist")
	@ResponseBody
	public String selectMember(@RequestParam(name="searchword", required=false) String searchword,
								@RequestParam("sort") String sort
								) throws Exception {
		
		List<AdminMember> list = service.selectMember(searchword, sort);

		return new Gson().toJson(list);
	}
}
