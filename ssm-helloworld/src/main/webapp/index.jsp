<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<c:out value="${pageContext.request.contextPath}"></c:out>

<c:out value="${'this is print by <c:out>'}" /><br/>
</body>
</html>
