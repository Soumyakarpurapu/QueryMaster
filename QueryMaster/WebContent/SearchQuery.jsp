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
<f:form modelAttribute="queryid" action="searchQu" method="post">
<td>Enter Query Id: </td>
				<td><f:input path="queryId" size="10" /> 
					</td>
					<td colspan=2><input type="submit" value="Search" /></td>
</f:form>
</body>
</html>