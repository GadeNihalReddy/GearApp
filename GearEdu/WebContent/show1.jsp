<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>queryid</th>
<th>technology</th>
<th>queryraisedby</th>
<th>query</th>
<th>solutions</th>
<th>solutiongivenby</th>
</tr>
<tr>
<td>${emp.query_id}</td>
<td>${emp.technology}</td>
<td>${emp.query_raised_by}</td>
<td>${emp.query}</td>
<td>${emp.solutions}</td>
<td>${emp.solution_given_by}</td>
</tr>
</table>
</body>
</html>