<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alert</title>
<script src="<%=request.getContextPath()%>/js/jquery-3.6.1.js"></script>
</head>
<body>
<script>
	if("${func}" == "adminLogin"){
		alert("${msg}");
		location.href = "<%= request.getContextPath()%>/member/login";
	}

</script>
</body>
</html>