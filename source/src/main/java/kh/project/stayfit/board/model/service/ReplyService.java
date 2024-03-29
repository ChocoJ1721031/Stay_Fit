package kh.project.stayfit.board.model.service;

import java.util.List;

import kh.project.stayfit.board.model.vo.Reply;

public interface ReplyService {

	// 댓글 조회
	public List<Reply> replylist(int bid) throws Exception;
	
	//댓글 list 갯수
	public int rtotalCnt(int bid) throws Exception;

	// 부모 댓글 작성
	public int write(Reply vo) throws Exception;
	
	// 자식 댓글 작성
	public int cwrite(Reply vo) throws Exception;

	// 댓글 수정
	public int update(Reply vo) throws Exception;

	// 댓글 삭제
	public int delete(int rid) throws Exception;

	// 댓글 좋아요 카운트용
	public int checklike(int rid, int mid) throws Exception;

	// 댓글 좋아요
	public int like(int rid, int mid) throws Exception;

	// 댓글 좋아요 삭제
	public int unlike(int rid, int mid) throws Exception;

	//댓글 신고
	public int report(int mid, int rid, int repid) throws Exception;
	
//	//답변 선택
//	public int adopt(int, int, int, int) throws Exception;

}
