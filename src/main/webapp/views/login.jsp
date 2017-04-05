<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/login.css">
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.0.min.js" ></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js" ></script>
	</head>
	<body>
	<div class="top">
	<p>WINHERE<a href="views/index.jsp"  class="s1 btn btn-warning">退出</a></p>
	</div>
	<div class="edit">
			<form action="edit" method="post">
				<input type="hidden" class="id" name="id"/><br>
				firstName:<input type="text" class="firstName" name="firstName"/><br>
				last_name:<input type="text" class="last_name" name="last_name"/><br>
				email:<input type="text" class="email" name="email"/><br>
				address:<select class="address_id" name="address_id">
				</select><br>
				<input type="submit" value="修改"/>
			</form>
	</div>
	<input type="hidden" class="span1" value="<%=request.getAttribute("message")%>"/>
	<script>
	var status = $(".span1").val();
	status=='login'?0:location.href='index.jsp';</script>
	<!-- <h2>13263 安超</h2> -->
		<div class="customer">
		<p>
			<a id="btn3" href="select2">Customer1管理(首页)</a><br>
		</p>
		<p>
			<a id="btn2" href="select1">Fiml管理</a>
		</p>
		</div>
		<div class="film">
			<h1>客户管理</h1>
			<h4>客户列表 <a id="add" class="btn btn-default" href="add.jsp">新增</a></h4>
			<p><a href="selectpage" id="before" class="a btn btn-default">上一页</a>   <a href="selectpage" id="next" class="a btn btn-default">下一页</a> <a href="select4" id="btn4" class="btn btn-default">尾页</a></p>
			<!-- <button id="b">获取所有address</button> -->
			<table  id="table1" class="table table-bordered table-hover table-condensed"></table>
			<!--<input type="button" value="上一页" id="before" /><input type="button" value="下一页" id="next" />-->
		</div>
	</body>

</html>