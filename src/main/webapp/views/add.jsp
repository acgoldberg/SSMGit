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
    <script type="text/javascript" src="js/jquery-3.2.0.min.js" ></script>
    <script type="text/javascript" src="js/add.js"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/add.css" />
  </head>
  <body>
    <center>
    <div class="login">
	<form action="add" method="post" class="form1">
	<table class="table table-bordered  table-condensed" >
		<tr>
			<th>First Name</th>
			<td><input type="text" name="firstname"/></td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><input type="text" name="lastname"/></td>
		</tr>
		<tr>
			<th>Eamil</th>
			<td><input type="text" name="lastname"/></td>
		</tr>
		<tr>
			<th>Adress</th>
			<td><select class="address_id" name="address_id"></select></td>
		</tr>
		<tr>
			<td><input type="submit" value="新建" class="add1 btn btn-default"/>  </td>
			<td><a href="views/index.jsp"   class="add2 btn btn-default">取消</a></td>
		</tr>
	</table>
	</form>	
	</div>
    </center>
  </body>
</html>
