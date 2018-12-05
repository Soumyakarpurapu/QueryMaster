<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gear Technical Forum</h1>
<h1>Answer the Query</h1>
<table>
<f:form modelAttribute="q" action="update" method="post">
<tr>
<th>Query Id:</th>
<td><f:input path="queryId" /></td>
</tr>
<tr>
<th>Select Technology:</th>
<td><f:input path="technology" /></td>
</tr>
<tr>
<th>Question:</th>
<td><f:input path="query" /></td>
</tr>
<tr>
<th>Question Raised By:</th>
<td><f:input path="queryGiver" /></td>
</tr>
<tr>
<th>Solution</th>
<td><f:input path="solution"  /> 
</tr>
<tr>
<th>Answered by:</th>
<td><div><f:select path="solutionGiver"  required="true">
<f:option value="">Please select</f:option>
<f:options items="${solutionGiver}"/>
</f:select>
</div></td>
</tr>
<tr>
<td colspan=2><input type="submit" value="Update Query" /></td>
</tr>
</f:form>
</table>
</body>
</html>