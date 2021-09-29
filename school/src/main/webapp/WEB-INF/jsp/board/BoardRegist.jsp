<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 기본 URL --%>
<c:url var="_BASE_PARAM" value="">
   <c:param name="menuNo" value="50"/>
     <c:if test="${not empty searchVO.searchCondition}"><c:param name="searchCondition" value="${searchVO.searchCondition}" /></c:if>
     <c:if test="${not empty searchVO.searchKeyword}"><c:param name="searchKeyword" value="${searchVO.searchKeyword}" /></c:if>
</c:url>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Language" content="ko" >
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<title>수업용 게시판</title>
<!-- BBS Style -->
<link href="/asset/BBSTMP_0000000000001/style.css" rel="stylesheet" />
<link href="http://172.16.144.100:2021/asset/BBSTMP_0000000000001/style.css" rel="stylesheet" />
<!-- 공통 Style -->
<link href="/asset/LYTTMP_0000000000000/style.css" rel="stylesheet" />
<link href="http://172.16.144.100:2021/asset/LYTTMP_0000000000000/style.css" rel="stylesheet" />

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
<c:choose>
	<c:when test="${not empty searchVO.boardId}">
		<c:set var="actionUrl" value="/board/update.do"/>
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/board/insert.do"/>
	</c:otherwise>
</c:choose>

<div class="contatiner">
	<div id="contents">
		<form action="${actionUrl}" method="post" id="frm" name="frm" onsubmit="return regist()">
			<input type="hidden" name="boardId" value="${result.boardId}"/>
			
			<table class="chart2">
				<caption>게시글 작성</caption>
				<colgroup>
					<col style="width:120px"/>
					<col/>
				</colgroup>
				<tbody>
					<tr>
						<th scope="row">제목</th>
						<td>
							<input type="text" id="boardSj" name="boardSj" title="제목입력" class="q3" value="<c:out value="${result.boardSj}"/>"/>
						</td>
					</tr>
					<tr>
						<th scope="row">공지여부</th>
						<td>
							<label for="noticeAtY">예 : </label>
							<input type="radio" id="noticAtY" value="Y" name="noticeAt" <c:if test="${result.noticeAt eq 'Y'}">checked="checked"</c:if>/>
						&nbsp;&nbsp;&nbsp;
						<label for="noticeAtN">아니요 : </label>
						<input type="radio" id="noticeAtN" value="N" name="noticeAt" <c:if test="${result.noticeAt ne 'Y'}">cheched="checked"</c:if>/>
						</td>
					</tr>
					<tr>
						<th scope="row">비공개여부</th>
						<td>
							<label for="othbcAtY">예 : </label>
							<input type="radio" id="othbcAtY" value="Y" name="othbcAt" <c:if test="${result.othbcAt eq 'Y'}">checked="checked"</c:if>/>
						&nbsp;&nbsp;&nbsp;
							<label for="othbcAtY">아니오 : </label>
							<input type="radio" id="othbcAtY" value="N" name="othbcAt" <c:if test="${result.othbcAt ne 'Y'}">checked="checked"</c:if>/>
						</td>
					</tr>
					<tr>
					<th>작성자 Id</th>
					</tr>
				</tbody>
			</table>
			
			<c:choose>
				<c:when test="${not empty searchVO.boardId}">
					<c:url var="uptUrl" value="/board/update.do">
						<c:param name="boardId" value="${result.boardId}"/>
					</c:url>
					<a href="${uptUrl}" id="btn-reg" class="btn">수정</a>
					
					<c:url var="delUrl" value="/board/delete.do">
						<c:param name="boardId" value="${result.boardId}"/>
					</c:url>
					<a href="${delUrl}" id="btn-del" class="btn"><i class="ico-del"></i>삭제</a>
				</c:when>
				<c:otherwise>
					<a href="#none" id="btn-reg" class="btn spot">등록</a>
				</c:otherwise>
			</c:choose>
			<c:url var="listUrl" value="/board/selectList.do"/>
			<a href="${listUrl}" class="btn">취소</a>
		</form>
	</div>
</div>
<script>
	$(document).ready(function(){
		//게시글 등록
		$("#btn-reg").click(function(){
			$("#frm").submit();
			return false;
		});
		
		//게시글 삭제
		$("#btn-del").click(function(){
			if(!confirm("삭제하시겠습니까?")){
				return false;
			}
		});
	});
	
	function regist(){
		if(!$("#boardSj").val()){
			alert("제목을 입력해주세요.");
			return false;
		}
	}
</script>

</body>
</html>