<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!DOCTYPE html>
<html lang="ko">
  <head>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

<body>
<center><font size=5><b><br>User<br></b></font></center>
<br>
<br>
   <table class=table align=center table style = "font-size : 14px;width:600px; height: 400px;">
          <colgroup>
        <col width="20%" />
        <col width="20%" />
        <col width="*" />
        <col width="8%"/>
        <col width="8%"/>
    </colgroup>
    <thead>
		<tr>
			<th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">PhoneNumber</th>
            <th scope="col">P.Update</th>
            <th scope="col">P.Delete</th>
        </tr>
    </thead>
       <tbody>
    <form  method="post">
			<tr>
            	<td><input type="text" class="form-control" id="id" name="id" value="${user.id}" readonly></td>
            	<td><input type="text" class="form-control" id="name" name="name" value="${user.name}" readonly></td>
            	<td>            
            		<c:forEach items="${phones}" var="phone">
                	<input type="text" class="form-control" id="PhoneNumber" name="PhoneNumber" value="${phone.no}" readonly>
             		</c:forEach>
             	</td>
             	<td>            
            		<c:forEach items="${phones}" var="phone">
            		<input type="hidden" name="id" value="${user.id}">
                	<a href=<c:url value='/phoneUpdateForm?phoneid=${phone.id}'/> class="btn btn-success" role="button">수정</a>
             		</c:forEach>
             	</td>
             	<td>	
             		<c:forEach items="${phones}" var="phone">
                	<a href=<c:url value='/delete?phoneid=${phone.id}'/> class="btn btn-success" role="button">삭제</a>
             		</c:forEach>
             		
             	</td>	
            </tr>
            </table>
      
        <center>
        <a href=<c:url value='/updateForm?id=${user.id}'/> class="btn btn-info" role="button">사용자 수정</a></td>
		<a href=<c:url value='/delete?id=${user.id}'/> class="btn btn-info" role="button">사용자 삭제</a></td>
		<a href=<c:url value='/phoneAddForm?id=${user.id}'/> class="btn btn-info" role="button">전화번호 추가</a></td>
		<a href=<c:url value='/list'/> class="btn btn-secondary" role="button">목록</a></td></td>
        </center>
    </form>
</div>
</body>
</html>