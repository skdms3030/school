<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="ko">
<meta charset="UTF-8">
<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous">
</script>
<title></title>
<style>
table {border-collapse: collapse;}
li {list-style: none; display: inline-block; padding: 10px;}
</style>
</head>
<body>
	<div>
		게시물 총 수  : <c:out value="${paginationInfo.totalRecordCount}"/> 건
	</div>
	<div>
	<table>
		<thead>
			<tr>
				<th>temp_id</th>
				<th>temp_val</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="result" items="${resultList}">
				<tr>
					<td><c:out value="${result.tempId}"/></td>
					<td>
						<c:url var="viewUrl" value="/temp/select.do">
							<c:param name="tempId" value="${result.tempId}"></c:param>
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
				<c:url var="pageUrl" value="/temp/selectList.do"></c:url>
				<c:set var="pagingParam"><c:out value="${pageUrl}"></c:out></c:set>
				<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pagingParam}"/>
			</ul>
		</div>
	</div>
	<button type="button" id="btn-reg" data-href="/temp/tempRegist.do">등록</button>
	
<script>
	$(document).ready(function() {
		$("#btn-reg").click(function() {
			location.href = $(this).data("href");
		});
		
		$(".btn-del").click(function() {
			if(!confirm("삭제하시겠습니까?")){
				return false;
			}
		});
	})
</script>
</body>
</html>