<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>sign up</title>	
	<script type="text/javascript" src="/SkyAir_MY/include/js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">	
	function skyairsignupfunction(str)
	{
		var strVal = str;		
		if(strVal == 'I')
		{			
			if (!$("#M_ID").val()) 
			{
				alert("아이디를 입력하세요.");
				$("#M_ID").focus();
				return false;
			}			
			if (!$("#M_PW").val()) 
			{
				alert("비밀번호를 입력하세요.");
				$("#M_PW").focus();
				return false;
			}			
			if (!$("#userpasscheck").val()) 
			{
				alert("비밀번호확인을 입력하세요.");
				$("#userpasscheck").focus();
				return false;
			}			
			if (!$("#M_NAME").val()) 
			{
				alert("이름을 입력하세요.");
				$("#M_NAME").focus();
				return false;
			}			
			if (!$("#M_TEL").val()) 
			{
				alert("연락처를 입력하세요.");
				$("#M_TEL").focus();
				return false;
			}			
			if (!$("#M_ADDR").val()) 
			{
				alert("주소를 입력하세요.");
				$("#M_ADDR").focus();
				return false;
			}
			if ($("#M_PW").val() == $("#userpasscheck").val())
			{
				var name = $("#M_NAME").val();
				var id = $("#M_ID").val();
				var tel = $("#M_TEL").val();
				var addr = $("#M_ADDR").val();	
				var bool = confirm ("이름 : " + name + "\n" +
									"아이디 : " + id + "\n" +
									"연락처 : " + tel + "\n" +
									"주소 : " + addr + "\n" +
									"이름 : " + name + "\n" 
									+ "위와 같이 입력하시겠습니까?");
				if (bool)
				{
					$("#sign").attr("action", "/SkyAir_MY/signup/signupok.do");
					$("#sign").submit();
				}
				else
				{
					alert("다시 입력해주세요!");
				}
				
			}
			else
			{
				alert("비밀번호를 정확히 입력하세요! ");
				return false;
			}			
		}
		if(strVal == 'C')
		{		
			$('#sign input[type="text"]').val(""); 
			$('#sign input[type="password"]').val("");
		}
		if(strVal == 'M')
		{			
			$("#sign").attr("action", "/SkyAir_MY/main/main.do");
			$("#sign").submit();
		}
	}
	$(function() 
	{
		$("#pwChek").click(function() 
		{			
			var userpass = $("#M_PW").val();
			var userpassck = $("#userpasswordcheck").val();
			if (!userpass) 
			{
				alert("비밀번호를 확인하세요");
				$("#M_PW").focus();
				return false;
			}
			else
			{
				alert("비밀번호가 일치합니다.");
			}
		});
		
		$("#idChek").click(function() 
		{			
			var idck = $("#M_ID").val();
			if(idck != "" != null)
			{
				$("#sign").attr("action", "/SkyAir_MY/signup/idcheck.do");
				$("#sign").submit();
			}
			else
			{
				alert("ID를 입력하세요! ");
				$("#M_ID").focus();
				return false;
			}
		});
	});	
	</script>
</head>
<body>
	<center>
	<c:if test="${not empty iecheck}">		
				<script>
					alert("${iecheck}");			
				</script>		
	</c:if>		
		<form id="sign" method="post">					
			<table border="1">
				<tr>
					<td colspan="2" align="center">
					<font color="blue" size="10">회원가입</font>
					</td>
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">ID</font>
					<td><input type="text" id=M_ID name=M_ID placeholder="E_MAIL을 입력하세요!" ><input type="button" id="idChek" value="ID확인">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">PW</font>
					<td><input type="password" id="M_PW" name="M_PW" placeholder="Password를 입력하세요!"  >							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">PW확인</font>
					<td><input type="password" id="userpasscheck" name="userpasscheck" placeholder="Password를 한번 더 입력하세요!"><input type="button" id="pwChek" value="비밀번호확인">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">이름</font>
					<td><input type="text" id="M_NAME" name="M_NAME" placeholder="이름을 입력하세요!" >							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">전화번호</font>
					<td><input type="text" id="M_TEL" name="M_TEL" placeholder="전화번호를 입력하세요!">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">주소</font>
					<td><input type="text" id="M_ADDR" name="M_ADDR" placeholder="주소를 입력하세요!" >							
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="button" value="가입" onclick="skyairsignupfunction('I')">
					<input type="button" value="Clear" onclick="skyairsignupfunction('C')">
					<input type="button" value="MAIN" onclick="skyairsignupfunction('M')">					
				</tr>											
			</table>
		</form>	
	</center>
</body>
</html>