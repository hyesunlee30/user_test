<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="ko">
  <head>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

<title>User List</title>
</head>
<body>
<br>
<br>
<center><font size=5><b>User List</b></font><center>
<br>
<br>


   <table class=table align=center table style = "font-size : 14px;width:400px;">
       <colgroup>
        <col width="30%"/>
        <col width="30%"/>
        <col width="*"/>
    </colgroup>
    <thead>
		<tr>
			<th scope="col">No</th>
            <th scope="col">User_Id</th>
            <th scope="col">Name</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
        		<c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list}" var="list" varStatus="i">
                	<tr>
                		<td>${i.count}</td>
                        <td>${list.id}</td>                        
                        <td><a href='/editForm?id=${list.id}'>${list.name}</a></td>                        
      				</tr>
                </c:forEach>
                </c:when>
   
            <c:otherwise>
               <tr>             
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>

	</table>
    <table align=center width=400>
 		<tr>
		<td width=170></td>
		<td width=300>
		</td>
		<td><button class="btn btn-primary" style="float : right;" onclick="location.href='/newForm.html'">추가</button></td>
		</tr>
	</table>
	
			<form action="list" method="post">
               <select name="opt">
                       <option value="name">이름</option>
                       <option value="phone">번호</option>                       
                </select>
               <input type="search" name="title">
               <button type="submit">검색</button>
         </form>
	
</body>
</html>



