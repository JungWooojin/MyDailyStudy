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
    <title><%=component.util.SystemInfoRepository.getInstance().getAppName_KR()%></title>
    <link href="${pageContext.request.contextPath}/css/component/oldland.css" rel="stylesheet">
    <style type="text/css">
	.search_header {height: 24px; width: 100%; background-color: #67819E; position: relative;}
	.icon_div {background:url(<c:url value="/images/btn_icon.png"/>) no-repeat center center; position: absolute; left: 7px; top: 2px;  
			   background-size: contain; width:19px; height:19px;}
	.search_header span {color: white; text-align: center; font-size: 14px; margin-left: 33px;}

	.landArchiveWrap {position: relative; padding-left: 22px;}
	
	.kindDiv {margin-left: 13px; margin-top: 17px;}
	.mountainDiv, .addressDiv {margin-left: 13px; margin-top: 7px;}
	.label {font-size: 14px; display:inline-block; width: 100px;} 
	.mountainDiv > span {font-size: 14px; display:inline-block; width: 30px;}
	
	checkbox {height: 30px;}
	input[type=text] {border : 1px solid #67819E; width: 136px;}
	select {border : 1px solid #67819E; height: 21px; width: 141px;}
	input[type=checkbox] {zoom: 1.5; margin-left: 2px; margin-top: -2px; margin-bottom: 2px;}
	
	.searchBtn {width: 242px; height: 30px; background-color: #67819E; margin: 0 auto; margin-top: 10px; cursor: pointer; position: relative;}
	.search_icon_div {background:url(<c:url value="/images/btn_search.png"/>) no-repeat center center; position: absolute; left: 109px; top: 4px;  
			   		  background-size: contain; width:25px; height:25px; }
	.searchBtn:hover {background-color: #67819E; transition: all 0.5s;}
	
	.mountainDiv .dash {width: 10px; padding-left: 4px; font-weight: bold;} 
	.mountainDiv .label  {width: 30px;}
	.mountainDiv .sLabel {margin-left: 20px; margin-right: 10px; font-size: 14px;}
	.mountainDiv .switch {margin-right: 16px;}
	.mountainDiv input[type=text] {width: 38px;}
	
	.loadingDiv {padding-top: 50px; width: 100%; text-align: center;}
</style>
    <script type="text/javascript">
        function search_info() {
            document.querySelector(".list_div").innerHTML = "";
            document.querySelector(".info_div").innerHTML = "";
            document.querySelector(".image_div").innerHTML = "";

            var kind = $(".kindSel").value;
            var address = $(".address").value;
            var jibun_fst = $(".jibun_fst").value;
            var jibun_snd = $(".jibun_snd").value;

            // �˻������� ���� ��� �˻��Ұ�
            if (kind === "" && address === "" && jibun_fst === "" && jibun_snd === "") {
                alert("�ּҸ� �Է��ϰų� ���� ������ �������ּ���.");
                return;
            }

            $(".list_div").innerHTML = "";
            var appendLoading = "<div class='loadingDiv'>" +
                "<img src='f'>" +
                "</div>";
            $(".list_div").innerHTML = appendLoading;
            // �̺κ��� JSTL�� ����ϹǷ� �״�� �Ӵϴ�.
            // document.querySelector(".list_div").load(
            //     "<c:url value='/landArchiveList.do'/>",
            //     { kind_name: kind_name, hjdon_name: hjdon_name, jibun_fst: jibun_fst, jibun_snd: jibun_snd }
            // );
            // ������ ��ȣ��, ������ ��ȣ��, 350, 23
        }
    </script>
</head>

<body>
    <!-- �˻����� : ���� /  ������ �ּ� /���� /�ι� / -->
    <div class="search_wrap">
        <div class="kindDiv">
            <label class="label">����</label>
            <select class="kindSel">
                <option value="">��ü</option>
                <option value="����������">����������</option>
                <option value="������">������</option>
                <option value="��ġ������">��ġ������</option>
                <option value="���������">���������</option>
                <option value="�̵������Ǽ�">�̵������Ǽ�</option>
                <option value="���������">���������</option>
                <option value="�����">�����</option>
                <option value="����������">����������</option>
                <option value="Ư����ġ��">Ư����ġ��</option>
                <option value="����������">����������</option>
                <option value="����������">����������</option>
                <option value="������������">������������</option>
            </select>
        </div>
        <div class="addressDiv">
            <label class="label">������ �ּ�</label>
            <input type="text" class="address">
        </div>
        <div class="jibunCode">
            <label class="sLabel">����</label>
            <input type="text" class="jibun_fst">
            <span class="dash">-</span>
            <input type="text" class="jibun_snd">
        </div>
        <div class="searchBtn" onclick="search_info()">
            <div class="search_icon_div"><img></div>
        </div>
    </div>
</body>
</html>

	


