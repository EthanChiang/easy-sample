<%@ page import="java.util.Date"  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歡迎光靈</title>
</head>
<body>
 hi HelloPage
 <%
 int y =7 ;
 Date x = new Date();
 %>
 <%= x.toLocaleString() %>
 <% out.println(y); %>
 
 </body>
</html>