<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'regist.jsp' starting page</title>
  </head>
  
  <body>
    	
    <s:fielderror />
    <form action="${pageContext.request.contextPath }/myRegist.action" method="post">
    	username:<input type="text" name="username">(非空，且长度为3-10位)<br>
    	password:<input type="password" name="pwd">(必须，且长度为6-12)<br>
    	repwd：<input  type="password" name="repwd">(必须和密码一致)<br>
    	age:<input type="text" name="age"> (年龄在18-90之间)<br>
    	phone:<input type="text" name="phone">(手机号规则，11位数字)<br>
    	email:<input type="text" name="email">(邮箱格式)<br>
    	<input type="submit" value="注册">
    </form>
  </body>
</html>