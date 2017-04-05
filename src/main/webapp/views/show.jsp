<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script  src="../css/jquery-3.2.0.min.js"></script>
</head>
<body>
<center>
 <table cellpadding="0" cellspacing="0" border="1px">
   <tr>
    <th>film_id</th>
   <th>title</th>
   <th>description</th>
   <th>release_year</th>
   <th>language_id</th>
   <th>original_language_id</th>
    <th>rental_duration</th>
   <th>rental_rate</th>
    <th>length</th>
   <th>replacement_cost</th>
    <th>rating</th>
   <th>special_features</th>
   <th>last_update</th>
  </tr> 
<c:forEach items="${list}" var="tom">
<tr>
   <th> <input value="${tom.filmId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.title}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.description}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.releaseYear}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.languageId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.originalLanguageId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.rentalDuration}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.rentalRate}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.length}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.replacementCost}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.rating}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.specialFeatures}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.lastUpdate}" style="border-style:none" readonly/></th>
 </tr>
</c:forEach>
</table>
<input type="button" value="上一页" id="before"/><input type="button" value="下一页" id="next"/>
</center>

</body>
</html>