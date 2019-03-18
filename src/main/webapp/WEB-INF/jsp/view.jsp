<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>LeeSORT / 예약시스템</title>
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

  </head>
<body>
<center><font size=5><b><br>User<br></b></font></center>
    <div class="container col-md-6">
    <form  method="post">
        <div class="form-group">
            <label for="exampleFormControlInput1">Id</label>
            <input type="text" class="form-control" id="id" name="id" value="${user.id}" readonly>
        </div>        
        <div class="form-group">
            <label for="exampleFormControlInput1">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="${user.name}" readonly>
        </div>

        <center>
        <a href=<c:url value='/Gongji1/updateForm/${user.id}'/> class="btn btn-info" role="button">수정</a></td>
		<a href=<c:url value='/Gongji1/delete/${user.id}'/> class="btn btn-info" role="button">삭제</a></td>
        <a href=<c:url value='/Gongji1/findAll'/> class="btn btn-secondary" role="button">목록</a></td>
        </center>
    </form>
</div>
</body>
</html>