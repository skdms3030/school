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
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
${result.tempVal}
<div class="box-btn">
	<c:url var="uptUrl" value="/temp/tempRegist.do">
		<c:param name="tempId" value="${result.tempId}"/>
	</c:url>
	<a href="${uptUrl}">수정</a>
	
	<c:url var="delUrl" value="/temp/delete.do">
		<c:param name="tempId" value="${result.tempId}"/>
	</c:url>
	<a href="${delUrl}" class="btn-del">삭제</a>
	
	<a href="/temp/selectList.do">목록</a>
</div>

<script>
$(document).ready(function(){
	$(".btn-del").click(function(){
		if(!confirm("삭제하시겠습니까?")){
			return false;
		}
	});
});
</script>



<%-- <c:forEach var="list" items="${result}">
결과 값 : ${list.tempId}==
결과 값 : ${list.tempVal}==
<br>
</c:forEach> --%>
</body>
</html>