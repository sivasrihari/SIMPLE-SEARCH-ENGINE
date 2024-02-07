<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying the related webs</title>
</head>
<body bgcolor=cyan>
<h1 style="color:blue;text-align:center">Related webs in the database are::</h1>
    <h2 style="color:blue;text-align:center">Search Results:</h2>
   
    <h2>Search Results</h2>
    
   	<c:choose >
   	<c:when test="${webresults ne null|| !empty webresults}">
	    <ul>
	        <c:forEach var="result" items="${webresults}">
	            <li>${result.title} - <a href="${result.url}" target="_blank">${result.url}</a></li>
	        </c:forEach>
	    </ul>
    </c:when>
    <c:otherwise>
    	<h2 style="color:red;text-align:center">The data related to given word is not found</h2>
    </c:otherwise>
    </c:choose>
     <h2 style="text-align:center">The status of user-name and user-id are saved ${status}</h2>
    
	<h1><a href="./display.jsp">|start from keyWord|</a></h1>
</body>

</html>