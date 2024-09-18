<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

JDBC Example:

<%
	// Get Driver (require to import driver lib)
	Class.forName("org.postgresql.Driver");


	String url = "";
	String username = "";
	String password = "";
	String sql = "";
	
	// Create Connection
	Connection con = DriverManager.getConnection(url, username, password);
	
	// Create Platform
	Statement st = con.createStatement();
	
	// Execute Query
	ResultSet rs = st.executeQuery(sql);

	rs.next();
	
%>

Roll No : <%=rs.getString(1)%>


</body>
</html>