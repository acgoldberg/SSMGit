<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/index.css">
	<%-- <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.0.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/index.js" ></script> --%>
    <script type="text/javascript" src="js/jquery-3.2.0.min.js" ></script>
    <script type="text/javascript" src="js/index.js" ></script>
  </head>
  
  <body background="img/index.jpg">
  	<h2>13263 安超</h2>
    <center>
    <div class="login">
    <p>电影租赁管理系统</p>
	<form action="check" method="post" class="form1">
		<input type="text" name="username" placeholder="用户名" class="username"/><br><br>
		<input type="password" name="password" placeholder="密码" class="password"/><br><br>
		<input type="button" id="input1"  value="登陆"/>
	</form>	
	<!--<button class="btn">ak-4</button>-->
	<span><c:if test="${message!=null}"><%=request.getAttribute("message")%>></c:if>
	</span>
	</div>
    </center>
<!--     	<script>
		
		$(".btn").click(function(){
	alert("btn");
});
		$("#input1").click(function(){
			alert("check");
			var username = $(".username").text();
			var password = $(".password").text();
			if(username.equals(password)){
				$(this).submit();
			}
		});

	</script> -->
  </body>
</html>
