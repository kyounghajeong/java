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
				alert("���̵� �Է��ϼ���.");
				$("#M_ID").focus();
				return false;
			}			
			if (!$("#M_PW").val()) 
			{
				alert("��й�ȣ�� �Է��ϼ���.");
				$("#M_PW").focus();
				return false;
			}			
			if (!$("#userpasscheck").val()) 
			{
				alert("��й�ȣȮ���� �Է��ϼ���.");
				$("#userpasscheck").focus();
				return false;
			}			
			if (!$("#M_NAME").val()) 
			{
				alert("�̸��� �Է��ϼ���.");
				$("#M_NAME").focus();
				return false;
			}			
			if (!$("#M_TEL").val()) 
			{
				alert("����ó�� �Է��ϼ���.");
				$("#M_TEL").focus();
				return false;
			}			
			if (!$("#M_ADDR").val()) 
			{
				alert("�ּҸ� �Է��ϼ���.");
				$("#M_ADDR").focus();
				return false;
			}
			if ($("#M_PW").val() == $("#userpasscheck").val())
			{
				var name = $("#M_NAME").val();
				var id = $("#M_ID").val();
				var tel = $("#M_TEL").val();
				var addr = $("#M_ADDR").val();	
				var bool = confirm ("�̸� : " + name + "\n" +
									"���̵� : " + id + "\n" +
									"����ó : " + tel + "\n" +
									"�ּ� : " + addr + "\n" +
									"�̸� : " + name + "\n" 
									+ "���� ���� �Է��Ͻðڽ��ϱ�?");
				if (bool)
				{
					$("#sign").attr("action", "/SkyAir_MY/signup/signupok.do");
					$("#sign").submit();
				}
				else
				{
					alert("�ٽ� �Է����ּ���!");
				}
				
			}
			else
			{
				alert("��й�ȣ�� ��Ȯ�� �Է��ϼ���! ");
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
				alert("��й�ȣ�� Ȯ���ϼ���");
				$("#M_PW").focus();
				return false;
			}
			else
			{
				alert("��й�ȣ�� ��ġ�մϴ�.");
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
				alert("ID�� �Է��ϼ���! ");
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
					<font color="blue" size="10">ȸ������</font>
					</td>
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">ID</font>
					<td><input type="text" id=M_ID name=M_ID placeholder="E_MAIL�� �Է��ϼ���!" ><input type="button" id="idChek" value="IDȮ��">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">PW</font>
					<td><input type="password" id="M_PW" name="M_PW" placeholder="Password�� �Է��ϼ���!"  >							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">PWȮ��</font>
					<td><input type="password" id="userpasscheck" name="userpasscheck" placeholder="Password�� �ѹ� �� �Է��ϼ���!"><input type="button" id="pwChek" value="��й�ȣȮ��">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">�̸�</font>
					<td><input type="text" id="M_NAME" name="M_NAME" placeholder="�̸��� �Է��ϼ���!" >							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">��ȭ��ȣ</font>
					<td><input type="text" id="M_TEL" name="M_TEL" placeholder="��ȭ��ȣ�� �Է��ϼ���!">							
				</tr>
				<tr>
					<td align="center"><font color="blue" size="5">�ּ�</font>
					<td><input type="text" id="M_ADDR" name="M_ADDR" placeholder="�ּҸ� �Է��ϼ���!" >							
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="button" value="����" onclick="skyairsignupfunction('I')">
					<input type="button" value="Clear" onclick="skyairsignupfunction('C')">
					<input type="button" value="MAIN" onclick="skyairsignupfunction('M')">					
				</tr>											
			</table>
		</form>	
	</center>
</body>
</html>