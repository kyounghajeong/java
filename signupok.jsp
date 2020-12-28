<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="/SkyAir_MY/include/js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
		alert("${result}");				
	</script>	
	<form id ="ok">		
		<script>
			$("#ok").attr("action", "/SkyAir_MY/main/main.do");
			$("#ok").submit();
		</script>
	</form>	
	</body>
</html>