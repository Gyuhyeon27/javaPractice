<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
	<c:if test="${empty deleteCustom }">
		<h2>삭제 실패 </h2>
	</c:if>
	<c:if test="${not empty deleteCustom }">
		<h2>삭제 성공 </h2>
	</c:if>
	<hr>
	<h3><a href="/Custom/customList">리스트 목록으로 돌아가기</a></h3>
</body>
</html>