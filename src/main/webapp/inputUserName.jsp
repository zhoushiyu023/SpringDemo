<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>zhoushiyu study</title>
</head>
<body>
	<c:if test="${!empty error }">
		<font color="red"><c:out value="${error}"/></font>
	</c:if>
	
	<form action="<c:url value="/userMsg.html"/>" method="post">
		用户姓名：
		<input type="text" name="userName">
		<input type="text" name="userPassword">
		<input type="submit" value="登录"/>
	</form>
</body>
</html>