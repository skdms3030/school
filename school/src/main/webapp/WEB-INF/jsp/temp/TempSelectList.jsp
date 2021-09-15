<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기</title>
<link href="/css/common.css" rel="stylesheet" type="text/css">
</head>
<body>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<div>
	게시물 총수 : <c:out value="${paginationInfo.totalRecordCount}"/>건
	<table>
	<caption>이 표는 TEMP_ID, TEMP_VAL로 구성되어 있는 표</caption>
		<thead>
			<tr>
				<th>TEMP_ID</th>
				<th>TEMP_VAL</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="result" items="${resultList}">
				<tr>
					<td><c:out value="${result.tempId}"/></td>
					<td>
						<c:url var="viewUrl" value="/temp/select.do">
							<c:param name="tempId" value="${result.tempId}"/>
						</c:url>
						<a href="${viewUrl}"><c:out value="${result.tempVal}"/></a>
					</td>
					<td>
						<c:url var="delUrl" value="/temp/delete.do">
							<c:param name="tempId" value="${result.tempId}"/>
						</c:url>
						<a href="${delUrl}" class="btn-del">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div id="paging_div">
		<ul class="paging_align">
			<c:url var="pageUrl" value="/temp/selectList.do"/>
			<c:set var="pagingParam"><c:out value="${pageUrl}"/></c:set>
			<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pagingParam}"/>
		</ul>
	</div>
</div>

<button type="button" id="btn-reg" data-href="/temp/tempRegist.do">등록하기</button>

<script>
	$(document).ready(function(){
		$("#btn-reg").click(function(){
			location.href = $(this).data("href");
		});
		$(".btn-del").click(function(){
			if(!confirm("삭제하시겠습니까?")){
				return false;
			}
		});
	});
</script>
</body>
</html>