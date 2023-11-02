package component.landArchive.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import component.landArchive.service.LandArchiveResultVO;
import component.landArchive.service.LandArchiveSearchVO;
import component.landArchive.service.LandArchiveService; 

@Controller
@RequestMapping("/landArchive")
public class LandArchiveController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LandArchiveController.class);
	
	@Resource(name ="LandArchiveService")
	protected LandArchiveService landArchiveService;
	
	@RequestMapping("/landArchiveMain.do")
	public String landArchiveMain(ModelMap model,HttpServletRequest request,String service_key) {
		LOGGER.info("Call landArchiveMain.do.."+ service_key );		
					return "component/landArchive/landArchiveMain";
	}
	
	@RequestMapping("/landArchiveSearch.do")
	public String landArchiveSearch(ModelMap model) {
		return "landArchive/landArchiveSearch";
	}
	
	@RequestMapping("/landArchiveList.do")
	public String landArchiveList(ModelMap model, LandArchiveSearchVO landArchiveSearchVo ) {
		LOGGER.info("Call landArchiveList.do.." + landArchiveSearchVo);
		return "landArchive/landArchiveList";
	}
	
	@RequestMapping("/landArchiveInfo.do")
	public String landArchiveInfo(ModelMap model, LandArchiveSearchVO landArchiveSearchVO, String isGetAllData) {
		LOGGER.info("Call landArchiveInfo.do.." + landArchiveSearchVO);
		
		String kind = landArchiveSearchVO.getKind();
		//String serial = landArchiveSearchVO.getSerial();
		String file_name = landArchiveSearchVO.getFile_name();
		//if(kind==null || kind.equals("") || serial==null || serial.equals("")) {return "landArchive/landArchiveInfo";}
		
		List<LinkedHashMap<String, Object>> result = null; 
		if(kind==null){return "landArchive/landArchiveInfo";};
		if(file_name.equals("면적측정부")) {
			result = landArchiveService.selectAreaList(file_name); 
		} else if(file_name.equals("지적도")) {
			result = landArchiveService.selectCadaMapList(file_name);
		} else if(file_name.equals("수치지적부")) {
			result = landArchiveService.selectFigureList(file_name);
		} else if(file_name.equals("토지조사부")) {
			result = landArchiveService.selectLandJosaList(file_name);
		} else if(file_name.equals("이동지결의서")) {
			result = landArchiveService.selectLandMoveList(file_name);
		} else if(file_name.equals("측량결과도")) {
			result = landArchiveService.selectMeasureList(file_name);
		} else if(file_name.equals("비법인")) {
			result = landArchiveService.selectNoCorpList(file_name);
		} else if(file_name.equals("지적재조사")) {
			result = landArchiveService.selectRexxamineList(file_name);
		} else if(file_name.equals("특별조치법")) {
			result = landArchiveService.selectSpmsList(file_name);
		} else if(file_name.equals("도근측량부")) {
			result = landArchiveService.selectTopographicList(file_name);
		} else if(file_name.equals("구토지대장")) {
			result = landArchiveService.selectMSDataList(file_name);
		} else if(file_name.equals("토지대장")) {
			result = landArchiveService.selectMSRQST(file_name);
		} model.addAttribute("file_name", file_name);
		
		if(isGetAllData !=null && isGetAllData.equals("true")) {
			model.addAttribute("isGetAllData", "true");
			model.addAttribute("result", result);
		} else {
			List<LinkedHashMap<String, Object>> prevResult = new ArrayList<LinkedHashMap<String,Object>>();
			if(result.size()>=10) {
				for(int i=0; i<10; i++) {
					prevResult.add(result.get(i));
				}
			} else {
				prevResult.addAll(result);
			}
			model.addAttribute("isGetAllData", "false");
			model.addAttribute("result", prevResult);
		}
		model.addAttribute("path_name",result.get(0).get("면적측정부"));
		model.addAttribute("file_name", file_name);
		model.addAttribute("kind", kind);
		model.addAttribute("size", result.size());
		return "landArchive/landArchiveInfo";
	}
	
	@RequestMapping("/landArchiveImage.do")
	public String landArchiveImage(ModelMap model, String imagePath) {
		LOGGER.info("Call landArchiveImage.do.." + imagePath);
		model.addAttribute("imagePath", imagePath);
		return "landArchive/landArchiveImage";
	}

	
	
	
}
