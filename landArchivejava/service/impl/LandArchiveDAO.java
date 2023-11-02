package component.landArchive.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import component.landArchive.service.LandArchiveResultVO;
import component.landArchive.service.LandArchiveSearchVO;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("LandArchiveDAO")
public class LandArchiveDAO extends EgovComAbstractDAO {
	private static final Logger LOGGER = LoggerFactory.getLogger(LandArchiveDAO.class);
	
	public List<LandArchiveSearchVO> selectLandArchiveList(LandArchiveSearchVO landArchiveSearchVO) {
		LOGGER.info("DAO - Call selectLandArchiveList.."  + landArchiveSearchVO);
    	return (List<LandArchiveSearchVO>) list("LandArchiveDAO.selectLandArchiveList", landArchiveSearchVO);
	}

	
	public List<LinkedHashMap<String, Object>> selectAreaList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectAreaList", file_name);
	}
	
	public List<LinkedHashMap<String, Object>> selectCadaMapList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectCadaMapList", file_name);
	}
	
	public List<LinkedHashMap<String, Object>> selectFigureList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectFigureList", file_name);
	}
	
	public List<LinkedHashMap<String, Object>> selectLandJosaList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectLandJosaList", file_name);
	}

	public List<LinkedHashMap<String, Object>> selectLandMoveList(String file_name) {		
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectLandMoveListList", file_name);
	}


	public List<LinkedHashMap<String, Object>> selectMeasureList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectMeasureList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectSurvMeasureList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectSurvMeasureList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectNoCorpList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectNoCorpList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectRexxamineList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectRexxamineList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectSpmsList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectSpmsList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectSurvChkSpmsList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectSurvChkSpmsList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectTopographicList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectTopographicList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectMSDataList(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectMSDataList", file_name);
	}

	
	public List<LinkedHashMap<String, Object>> selectMSRQST(String file_name) {
		return (List<LinkedHashMap<String, Object>>) list("LandArchiveDAO.selectMSRQSTList", file_name);
	}

	
}
