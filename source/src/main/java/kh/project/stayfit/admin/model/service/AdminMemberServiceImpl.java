package kh.project.stayfit.admin.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.project.stayfit.admin.model.dao.AdminMemberDao;
import kh.project.stayfit.admin.model.vo.AdminDashboard1;
import kh.project.stayfit.admin.model.vo.AdminMember;

@Service
public class AdminMemberServiceImpl implements AdminMemberService{
	
	@Autowired
	private AdminMemberDao dao;

	
	@Override
	public List<AdminMember> selectMember(String searchword, String sort) throws Exception {
		return dao.selectMember(searchword, sort);
	}

	@Override
	public List<AdminDashboard1> selectChart(String mid, String chart) throws Exception {
		return dao.selectChart(mid, chart);
	}
	
}
