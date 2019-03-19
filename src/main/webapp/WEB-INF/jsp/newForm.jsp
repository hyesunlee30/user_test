<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Add</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>User Add</title>
    <!-- meta tags 필요 -->
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
</head>
   
<body>
<center><font size=5><b><br>User Add<br></b></font></center>
<div class="container col-md-3">
    <form method="POST" id="newForm" name="newForm">
          <div class="form-group">
            <label for="exampleFormControlInput1">Id</label>
            <input type="text" class="form-control" id="id" name="id" value="" readonly placeholder="자동부여">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="" placeholder="이름을 입력하세요.">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">PhoneNumber</label>
            <input type="text" class="form-control" id="PhoneNumber" name="PhoneNumber" value="" placeholder="폰번호를 입력하세요."   >
        </div>
        <center>        	
			 <button onClick='fn_addtoUser()' class="btn btn-info" >추가</button>
             <button onClick='fn_cancel()' class="btn btn-secondary">목록</button>
        </center>             
    </form>   
<script>
//글쓰기
function fn_addtoUser(){
    
    var form = document.getElementById("newForm");


    if(form.name.value == ""){
        alert("이름을 입력해주세요.");
        form.name.focus();
        return;
    }
    if(form.PhoneNumber.value == ""){
        alert("폰번호를 입력해주세요.");
        form.PhoneNumber.focus();
        return;
    }
    
  form.action = "<c:url value='/save'/>";
  form.submit();

}
 
//목록
function fn_cancel(){
    
    var form = document.getElementById("newForm");

    form.action = "<c:url value='/list.html'/>";
    form.submit();
    
}
</script>
</div>
</body>
</html>