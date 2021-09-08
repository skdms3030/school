<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기</title>
</head>
<body>

<c:forEach var="list" items="${result}">
결과 값 : ${list.tempId}==
결과 값 : ${list.tempVal}==
<br>
</c:forEach>
</body>
</html>