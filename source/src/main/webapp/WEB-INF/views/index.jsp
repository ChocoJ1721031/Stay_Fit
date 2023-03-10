<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <!-- Google 로그인 -->
    <meta name ="google-signin-client_id" content="856477250980-o2tmcsucq41hesvhik5df9duaal5b1sp.apps.googleusercontent.com">
    <meta>
    <title>StayFit</title>
    
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/style.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/header.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/footer.css" type="text/css">
   
    <!-- Js Plugins -->
   	<script src="<%=request.getContextPath() %>/resources/js/jquery-3.3.1.min.js"></script>
   	<script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/resources/js/mixitup.min.js"></script>
    
    
   	<%--  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/board.css"/> 없음--%>
   	
   	<!-- shop 시작 -->
    <c:if test="${sectionName eq 'shop/*' or sectionName eq 'shop/main.jsp'}">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/shop.css" type="text/css">
	</c:if>
	<!-- shop 끝 -->
    
    <!-- mypage 시작 -->
    <c:if test="${sectionName eq 'mypage/*' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/mypagecategory.css" type="text/css">
	</c:if>
    <c:if test="${sectionName eq 'mypage/mywish.jsp' }"></c:if>
	<c:if test="${sectionName eq 'mypage/mycart.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/mycart.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'mypage/myproduct.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/myproduct.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'mypage/myboard.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/myBoard.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'mypage/myprofile.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/myprofile.css" type="text/css">
	</c:if>
	<!-- mypage 끝 -->
	
	
    
    <!-- health page css 시작 -->
	<c:if test="${sectionName eq 'health/caloriewrite.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/caloriewrite.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'health/calorielist.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/calorielist.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'health/bmiwrite.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bmiwrite.css" type="text/css">
	</c:if>	
	<c:if test="${sectionName eq 'health/bmilist.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bmilist.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'health/centerlist.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/centerlist.css" type="text/css">
	</c:if>	
	<!-- health page css 끝 -->
	
	
	<!--board 시작  -->
	 <c:if test="${sectionName eq 'board/list.jsp' || sectionName eq 'board/read.jsp'}">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/boardlist.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/boardread.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'board/write.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/boardread.css" type="text/css">
		<!-- jquery/bootstrap -->
		<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<!--  summernote css/js -->
		<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script> 
	</c:if>
	<!--board 끝  -->
	
	<c:if test="${sectionName eq 'member/login.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/member.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'member/join.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/member.css" type="text/css">
	</c:if>
	<c:if test="${sectionName eq 'member/pwfind.jsp' }">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/member.css" type="text/css">
	</c:if>
	
	
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Humberger Begin -->
    <div class="humberger__menu__overlay"></div>
    <div class="humberger__menu__wrapper">
        <div class="humberger__menu__logo">
            <a href="#"><img src="<%=request.getContextPath() %>/resources/img/logo.png" alt=""></a>
        </div>
        <div class="humberger__menu__cart">
            <ul>
                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
            </ul>
            <div class="header__cart__price">item: <span>$150.00</span></div>
        </div>
        <div class="humberger__menu__widget">
            <div class="header__top__right__language">
                <img src="<%=request.getContextPath() %>/resources/img/language.png" alt="">
                <div>English</div>
                <span class="arrow_carrot-down"></span>
                <ul>
                    <li><a href="#">Spanis</a></li>
                    <li><a href="#">English</a></li>
                </ul>
            </div>
            <div class="header__top__right__auth">
                <a href="#"><i class="fa fa-user"></i> Login</a>
            </div>
        </div>
        <nav class="humberger__menu__nav mobile-menu">
            <ul>
                <li class="active"><a href="./index.html">Home</a></li>
                <li><a href="./shop-grid.html">Shop</a></li>
                <li><a href="#">Pages</a>
                    <ul class="header__menu__dropdown">
                        <li><a href="./shop-details.html">Shop Details</a></li>
                        <li><a href="./shoping-cart.html">Shoping Cart</a></li>
                        <li><a href="./checkout.html">Check Out</a></li>
                        <li><a href="./blog-details.html">Blog Details</a></li>
                    </ul>
                </li>
                <li><a href="./blog.html">Blog</a></li>
                <li><a href="./contact.html">Contact</a></li>
            </ul>
        </nav>
        <div id="mobile-menu-wrap"></div>
        <div class="header__top__right__social">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-pinterest-p"></i></a>
        </div>
        <div class="humberger__menu__contact">
            <ul>
                <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                <li>Free Shipping for all Order of $99</li>
            </ul>
        </div>
    </div>
    <!-- Humberger End -->

    <!-- Header Section Begin -->
    <jsp:include page="/WEB-INF/views/header.jsp"/>
    <!-- Header Section End -->
	
	
	<!-- Section Begin -->
    <jsp:include page="/WEB-INF/views/${sectionName}"/>
    <!-- Section End -->
    
    
    <!-- Footer Section Begin -->
    <jsp:include page="/WEB-INF/views/footer.jsp"/>
    <!-- Footer Section End -->


	<!-- Js Plugins -->
    <script src="<%=request.getContextPath() %>/resources/js/jquery.nice-select.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/jquery-ui.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/jquery.slicknav.js"></script>
    
    <script src="<%=request.getContextPath() %>/resources/js/owl.carousel.min.js"></script>
	<script src="<%=request.getContextPath() %>/resources/js/main.js"></script>

</body>

</html>