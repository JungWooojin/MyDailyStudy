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
		
		<style type="text/css">
	.landArchiveWrap {padding-top: 5px;}
	
	.selectTitle01 {line-height: 20px; font-size: 13px; cursor: pointer; font-weight: bold; color: #374857; font-family: 맑은 고딕; margin-left: -10px;}
	.selectTitle01 .showDown02 {display: none; color: #67819E; margin-left: 7px;}
	.selectTitle01 .showDown02 li {margin-left: 6px; font-size: 12px; font-family: 맑은 고딕;}
	
	.selectTitle02 {line-height: 20px; font-size: 12px; cursor: pointer; font-weight: bold; color: #374857; font-family: 맑은 고딕;}
	.selectTitle02 span {margin-left: 15px;}
	
	.selectTitle02 .showDown02 {display: none; color: #67819E; margin-left: 15px;}
	.selectTitle02 .showDown02 li {margin-left: 6px; font-size: 12px; font-family: 맑은 고딕;}
	
	.selectTitle02 img {width: 6px; height: 9px; margin-top: 5px; position: absolute; left: 10px; margin-left: 15px;}
	
	.selected {color: #2196F3 !important;}
	
	.showDown01 {display: none;}
	.showDown02 {display: none;}
</style> 
	<script type="text/javascript">
	function showLandArchiveMenu(idx){
		$(".c1List_"+idx).toggle();
	} 
	 
	function showLandArchiveSubMenu(object){
		$(object).siblings(".showDown02").toggle();
	}
	
	function onItemSelect(file_name, kind, object){
		if(typeof object == "undefined"){
			object = $(".permSelected"); 
		}
		
		$(".container.showDown02.selected").attr("class", "container showDown02");
		$(object).attr("class","container showDown02 selected");
		getItemDetail(file_name, kind, "false");
	}
	
	function getItemDetail(file_name, kind, isGetAllData){
		$(".info_div").empty();
		var appendLoading = "<div class='loadingDiv'>" + 
				"<img src='${pageContext.request.contextPath}/images/Progress_Loading.gif'>" + 
			"</div>";
		$(".info_div").append(appendLoading);	
		console.log("QUERY : " + file_name + kind);
		console.log($(".info_div"));
		$(".info_div").load(
				"<c:url value='/landArchiveInfo.do'/>",
				{file_name:file_name, kind:kind, isGetAllData:isGetAllData}
		);
	}
	
	$( document ).ready(function() {
		//IMG HOVER
		$(".hoverImg").mouseenter(function() {
			var originSrc = $(this).attr("src");
			var newSrc = originSrc.replace("_off","_on");
			$(this).attr("src",newSrc);
		});
		
		//IMG HOVER
		$(".hoverImg").mouseleave(function() {
	    	var originSrc = $(this).attr("src");
			var newSrc = originSrc.replace("_on","_off");
			$(this).attr("src",newSrc);
		});
		
		//SPAN HOVER
		$(".hoverSpan").mouseenter(function() {
			var originSrc = $(this).siblings(".hoverImg").attr("src");
			var newSrc = originSrc.replace("_off","_on");
			$(this).siblings(".hoverImg").attr("src",newSrc);
		});
		
		//SPAN HOUT
		$(".hoverSpan").mouseleave(function() {
	    	var originSrc = $(this).siblings(".hoverImg").attr("src");
			var newSrc = originSrc.replace("_on","_off");
			$(this).siblings(".hoverImg").attr("src",newSrc);
		});
	});
</script>
</head>
<body>
	<div class="search_header">
			<div class="icon_div"></div>
			<span>검색결과</span>
			<div class="landArchiveWrap">
		<c:forEach items="${landArchiveList}" var="landArchiveList" varStatus="status1">
		<li class="selectTitle01">
			<img src= "${pageContext.request.contextPath}/images/exp_open_off.png" onclick="showLandArchiveMenu(${status1.index})" class="hoverImg">
			<span class="container hoverSpan" onclick="showLandArchiveMenu(${status1.index})">${landArchiveList.hjdon_name} ${landArchiveList.jibun_fst} ${landArchiveList.jibun_snd} }</span>
			<c:forEach items="${landArchiveList.landArchiveResultCatList}" var="landArchiveResultCatList" varStatus="status2">
				<li class="selectTitle02 showDown01 c1List_${status1.index}">
					<img src= "${pageContext.request.contextPath}/images/exp_open_off.png" onclick="showLandArchiveSubMenu(this)" class="hoverImg">
					<span class="container hoverSpan" onclick="showLandArchiveSubMenu(this)">${landArchiveResultCatList.cat1}</span>
					<c:forEach items="${landArchiveResultCatList.landArchiveResultItemList}" var="landArchiveResultItemList" varStatus="status3">
						<p class="container showDown02" id="${landArchiveResultItemList.file_name}" onclick="onItemSelect('${landArchiveResultItemList.file_name}', '${landArchiveResultCatList.cat1}', this)">${landArchiveResultItemList.cat3}</p> 
					</c:forEach>	 
				</li>
			</c:forEach>
		</li>
		</c:forEach>
	</div>
		</div>
	
		
		
		
</body>
</html>