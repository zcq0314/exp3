<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="post" name = "form1">
    用户名<input type = "text" name = "userid" onclick = "mes.innerHTML="value = "${param.userid }"/><br/>
    密&nbsp;&nbsp;&nbsp;码<input type = "password" name = "userpwd" value = "${param.userpwd }"/><br/>
    验证码<input type = "text" name = "checkcode"/>
    <img border="0" src="createImageServlet"/>
    <input type = "submit" value = "换一张" onclick = "form1.action='changeCheckCodeServlet'"/>
    <br/>
    <input type = "submit" value = "登录" onclick = "form1.action = 'logCheckServlet'"/>
    <input type = "reset" value = "重置"/>
    <div id = "mes">${info }</div>
    </form>
</body>
</html>

