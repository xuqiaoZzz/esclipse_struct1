<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  <body>
    <h3>登录：请求数据校验--代码手动校验</h3>
	<s:fielderror/>
	<form action="${pageContext.request.contextPath }/user_login.action" method="post">
		用户名：<input type="text" name="username"/><br/>
		密    码：<input type="password" name="pwd"/><br/>
		<input type="submit" value="登录"/>
	</form>
  </body>
</html>