<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test page</title>
</head>
<body>
<h1>Test</h1>

<%@page import="java.util.Arrays,java.util.List" %>

<%!
// Declarative
	List<Integer> list = Arrays.asList(1,2,3,4);
	int int1=90;
%>

<%
// Scriptlet
out.println(list);
out.println(int1);
%>

<%=
// Expression
	int1
%>

</body>
</html>