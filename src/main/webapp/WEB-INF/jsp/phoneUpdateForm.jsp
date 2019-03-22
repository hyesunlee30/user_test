<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PhoneNumber</title>
  <meta name="viewport" content="width=400px, initial-scale=1, shrink-to-fit=no">
    <title>User</title>
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=400px, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

  </head>
<body>
<center><font size=5><b><br>PhoneNumber<br></b></font></center>

    <div class="container col-md-6">
    <form method="post" id="updateForm" name="updateForm">

        <div class="form-group">
            <label for="exampleFormControlInput1">PhoneNumber</label>
                	<input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${phones.no}" >
        </div>        
        <center>
        <input type="hidden" name="phoneid" value="${phones.id}">
        <button onClick='fn_updateUser()' class="btn btn-info" >번호 수정</button>
		<a href=<c:url value='/list'/> class="btn btn-secondary" role="button">목록</a></td></td>
        </center>
    </form>
    
<script>
//글쓰기
function fn_updateUser(){
    
    var form = document.getElementById("updateForm");

  form.action = "<c:url value='/update.html'/>";
  form.submit();

}
</script>
    
</div>
</body>
</html>