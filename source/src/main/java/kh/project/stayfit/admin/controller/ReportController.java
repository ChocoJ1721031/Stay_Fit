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

import kh.project.stayfit.admin.model.service.AdminBoardService;
import kh.project.stayfit.admin.model.vo.AdminBoard;
import kh.project.stayfit.admin.model.vo.AdminReport;

@Controller
@RequestMapping("/admin")
public class ReportController {
	
	@Autowired
	private AdminBoardService service;
	
	
	@GetMapping("/report")
	public ModelAndView report(ModelAndView mv, HttpServletRequest request) throws Exception {
		
		// 로그인을 하지 않은 경우나 admin이 아닌 사용자가 url로 접근하는 것 막는 코드
		if(request.getSession().getAttribute("mrole") == null || !('A' == (char)request.getSession().getAttribute("mrole"))){
			mv.addObject("func", "adminLogin");
			mv.addObject("msg", "관리자만 접근 가능한 페이지입니다.");
			mv.setViewName("/admin/resultAlert");
		} else {
			mv.addObject("currentMenu", 5);
			mv.setViewName("/admin/report");
		}
		return mv;
	}
	
	// 목록 출력
	@GetMapping("/reportlist")
	@ResponseBody
	public String selectReport(@RequestParam("reason") String reason,
								@RequestParam("sort") String sort
								) throws Exception {
		
		List<AdminReport> list = service.selectReport(reason, sort);

		return new Gson().toJson(list);
	}
	
	// 신고댓글 삭제
	@PostMapping("/replydelete")
	@ResponseBody
	public int deleteReply(@RequestParam("rid") String rid) throws Exception {
		
		int result = service.deleteReply(rid);

		return result;
	}
	
	// 신고 삭제
	@PostMapping("/reportdelete")
	@ResponseBody
	public int deleteReport(@RequestParam("rid") String rid,
							@RequestParam("reporter") String reporter
							) throws Exception {
		
		int result = service.deleteReport(rid, reporter);
		
		return result;
	}
	
	
	
}