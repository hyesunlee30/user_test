<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
  <meta name="viewport" content="width=400px, initial-scale=1, shrink-to-fit=no">
    <title>User</title>
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=400px, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

  </head>
<body>
<center><font size=5><b><br>User<br></b></font></center>

    <div class="container col-md-6">
    <form  method="post" id="updateForm" name="updateForm">
    
        <div class="form-group">
            <label for="exampleFormControlInput1">Id</label>
            <input type="text" class="form-control" id="id" name="id" value="${user.id}" readonly>
        </div>        
        <div class="form-group">
            <label for="exampleFormControlInput1">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">PhoneNumber</label>
            <c:forEach items="${phones}" var="phone">
                	<input type="text" class="form-control" id="phonenumber" name="phonenumber" value="${phone.no}" readonly>
             </c:forEach>
        </div>        
        <center>
        <input type="hidden" name="id" value="${user.id}">
        <button onClick='fn_updateUser()' class="btn btn-info" >사용자 수정</button>
		<a href=<c:url value='/delete/${user.id}'/> class="btn btn-info" role="button">사용자 삭제</a></td>
		<a href=<c:url value='/list'/> class="btn btn-secondary" role="button">목록</a></td></td>
        </center>
    </form>
    
<script>
//글쓰기
function fn_updateUser(){
    
    var form = document.getElementById("updateForm");


    if(form.name.value == ""){
        alert("이름을 입력해주세요.");
        form.name.focus();
        return;
    }

  form.action = "<c:url value='/update'/>";
  form.submit();

}
</script>
    
</div>
</body>
</html>