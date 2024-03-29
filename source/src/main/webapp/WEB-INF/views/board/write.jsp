<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 게시판 글작성 페이지 -->

<%if(request.getSession().getAttribute("mid") != null) {
    int mid = (int) request.getSession().getAttribute("mid");
    %>
<input type="hidden" id="mid" name="mid" value="<%=mid%>">
<%}%>

<section class="blog spad">
	<div class="container">
		<div class="row">
			<!-- 게시판 카테고리 -->
			<jsp:include page="/WEB-INF/views/board/boardcategory.jsp"></jsp:include>
			<div class="col-lg-8 col-md-7">
				<div class="row">
					<div class="" style="width:"30%"; margin-bottom: 15px;"></div>
					<form action="<%=request.getContextPath()%>/board/write" method="post">
						<div class="">
							<select name="bcid" id="bcid">
								<option value="" selected>카테고리 선택</option>
								<!-- 관리자만 공지사항 작성가능-->
								<c:if test="${writer == 1 }"> 
									<option value="0">공지사항</option>
								</c:if>
								<!-- 관리자만 공지사항 작성가능 끝  -->
								<option value="1">식단</option>
								<option value="2">팁&노하우</option>
								<option value="3">고민&질문</option>
							</select>
						</div>
						<div class="form-group ">
							<input id="btitle" name="btitle" class="form-control" placeholder="제목을 입력하세요" required="required">
						</div>
						<div class="form-group">
							<input type="hidden" id="mid" name="mid" value="${writer}">
							<textarea id="summernote" name="bcontent"></textarea>
						</div>

						<div class="button_parent">
							<button type="submit" class="site-btn btn-submit">등록</button>
							<button type="button" class="site-btn btn-list" onclick="location.href='list">목록으로</button>
							<!-- <button type="button" class="site-btn btn-preview">미리보기</button> -->
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
		$('#summernote').summernote({
			lang: 'ko-KR',
			height: 400,
			focus : true			
		});

</script>