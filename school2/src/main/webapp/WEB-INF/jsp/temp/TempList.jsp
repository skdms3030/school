<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<body>
	<a href="/temp/regist.do">등록 / 수정</a>

	<table border="1">
		<thead>
			<tr>
				<td>temp_id</td>
				<td>temp_val</td>
				<td>관리</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${result}">
				<tr>
					<td>${list.tempId}</td>
					<td><a href="/temp/regist.do?tempId=${list.tempId}">${list.tempVal}</a></td>
					<td><a href="/temp/delete.do?tempId=${list.tempId}">삭제</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>