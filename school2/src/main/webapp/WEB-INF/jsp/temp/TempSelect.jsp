<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${result.tempVal}
	<div class="box-btn">
		<c:url var="uptUrl" value="/temp/tempRegist.do">
			<c:param name="tempId" value="${result.tempId}"></c:param>
		</c:url>
		<a href="${uptUrl}">수정</a>

		<c:url var="delUrl" value="/temp/delete.do">
			<c:param name="tempId" value="${result.tempId}" />
		</c:url> <a href="${delUrl}" class="btn-del">삭제</a>
		
		<a href="/temp/selectList.do">목록</a>
	</div>
	
	<script>
		$(function() {
			$(".btn-del").click(function() {
				if(!confirm("삭제하시겠습니까?")){
					return false;
				}
			});
		})
	</script>
</body>
</html>