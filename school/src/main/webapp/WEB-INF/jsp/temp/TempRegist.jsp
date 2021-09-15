<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:choose>
	<c:when test="${not empty searchVO.tempId}">
		<c:set var="actionUrl" value="/temp/update.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/temp/insert.do"></c:set>
	</c:otherwise>
</c:choose>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기</title>
</head>
<body>
* 등록폼
${result.tempId}====
<form action="${actionUrl}" method="post" name="tempVO">
	<input type="hidden" name="tempId" value="${result.tempId}"/>
	<label for="tempVal">값 정보 : </label>
	<input type="text" id="tempVal" name="tempVal" value="${result.tempVal}">
	<br>
	<button type="submit">등록</button>


	<!-- <label for="tempVal">값 정보 : </label>
	<input type="text" id="tempVal" name="tempVal">
	<br>
	<button type="submit">등록</button> -->
</form>
</body>
</html>