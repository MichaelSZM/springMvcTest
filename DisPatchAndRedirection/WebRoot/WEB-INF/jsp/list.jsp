<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1 style="text-align:center">teacher列表</h1>
    <a href="toAdd.do"><h3 style="text-align:center"">添加</h3></a>
    <table>
    	<thead>
    		<tr>
    			<td>ID</td>
    			<td>姓名</td>
    			<td>密码</td>
    			<td>操作</td>
    			<td>操作</td>
    		</tr>
    	</thead>
    	<c:forEach items="${list} var="t"">
    		<tr>
    			<td>${t.id }</td>
    			<td>${t.name }</td>
    			<td>${t.password }</td>
    			<td><a href="toUpdate.do?id={t.id}">修改</a></td>
    			<td><a href="delete.do?id={t.id}">删除</a></td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
