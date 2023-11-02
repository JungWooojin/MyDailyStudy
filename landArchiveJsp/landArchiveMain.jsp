<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<title> <%=component.util.SystemInfoRepository.getInstance().getAppName_KR()%> </title>
	<link href="${pageContext.request.contextPath}/css/component/map_main.css" rel="stylesheet">
	
	<style type="text/css">
	html, body 		{ height:100%; 	overflow: hidden;}
	.header			{ width:100%; height: 40px; font-size: 17px; color: white; background-color: #67819E; border-bottom: solid 1px white;}
	.header p 		{ line-height: 40px; margin-left: 20px;} 
	.contents 		{ width: 100%; 	height: calc(100% - 41px); overflow: hidden;}
	.left_contents 	{ width: 270px; height: 100%;  border-right: solid 1px #67819E;}
	.right_contents { width: 100%; 	height: 100%;}
	.search_div 	{ width: 270px; height: 175px; border-bottom: solid 1px #67819E;}
	.list_div 		{ width: 270px; height: calc(100% - 385px); border-bottom: solid 1px #67819E;  overflow-y: auto;}
	.info_div 		{ width: 270px; height: 210px; overflow-y: auto;    overflow-x: hidden;}
	.image_div 		{ width: calc(100% - 271px); height: 100%; margin-left: 271px; overflow: hidden;}
</style>

</head>
<body>
<div class="header"> 
	<p>지적물기록시스템</p>
	</div>
	<div class="contents">
		<div class="left_contents">
			<div class="search_div">
				<c:import url="/landArchiveSearch.do"/>
			</div>
			<div class="list_div" style="height: 47px; ">
			</div>
			<div class="info_div">
			</div>
		</div>
		<div class="right_contents">
			<div class="image_div">
			</div>
		</div>
		</div>
</body>
</html>

