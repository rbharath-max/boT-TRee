<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SKY DIVING</title>
</head>
<body>




<c:if test="${fn:contains(String, 'sky') }">
	<p>yes.....the String contains the word sky<p>
</c:if>

<c:if test="${fn:contains(String, 'diving') }">
	<p>yes.....the String contains the word diving....<p>
</c:if>

<h2> Welcome to skydive </h2>

<c:out value="${'<h2> Welcome to skydive </h2>' }"/>


<c:out value="${'Welcome to skydiving class' }"/>

<c:forEach var="i" begin="1" end="5"> Seat 
	<c:out value="${i }"/>
	</c:forEach>


<%
out.println(request.getClass());
out.println("\n<h5>"+application.getContextPath()+"\n<h5>");
out.println("\n<h5>"+page.getClass()+"\n from page<h5>");
out.println("\n<h5>"+config.getClass()+"\n from config<h5>");
int len=request.getContentLength();
out.println(len);
String s=page.toString();
int hashc=page.hashCode();
%>




<a href="https://www.skydivedubai.ae/en/experienced-skydiving/prices" target="_blank">Visit Skydive dubai!</a>







</body>
</html>