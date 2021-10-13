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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기 </title>
</head>
<body>
	<%-- <form action="/temp/insert.do" method="post" name="frm">
		<div>
			<h4>등록 / 변경</h4>
			<p>신규 아이디 생성을 선택 후 값을 입력하면 신규 생성</p>
			<p>특정 아이디를 선택하면 이전 값을 변경</p>
			<label for="tempId">선택</label>
			<select name="tempId">
				<option value="">신규 아이디 생성</option>
				<c:forEach var="item" items="${list}">
					<option value="${item.tempId}">${item.tempId} / 저장된 값 : ${item.tempVal}</option>
				</c:forEach>
			</select>
			<label for="tempVal">등록 혹은 변경 할 값: </label>
			<input type="text" id="tempVal" name="tempVal">
			<br>
			<button type="submit">변경</button>						
		</div>
	</form> --%>
	* 등록폼 
	<form action="${actionUrl}" method="post" name="tempVO" >
		<input type="hidden" name="tempId" value="${result.tempId}">
	    <label for="tempVal">값 정보:</label>
	    <input type="text" id="tempVal" name="tempVal" value="${result.tempVal}">
	    <br/>
	    <button type="submit">등록</button>
	</form>
</body>
</html>