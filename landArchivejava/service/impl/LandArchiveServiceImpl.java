package component.landArchive.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import component.board.basicBoard.service.impl.BasicBoardServiceImpl;
import component.landArchive.service.LandArchiveResultVO;
import component.landArchive.service.LandArchiveSearchVO;
import component.landArchive.service.LandArchiveService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("LandArchiveService")
public class LandArchiveServiceImpl extends EgovAbstractServiceImpl implements LandArchiveService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BasicBoardServiceImpl.class);

	@Resource(name ="LandArchiveDAO")
	private LandArchiveDAO landArchiveDAO;

	@Override
	public List<LandArchiveSearchVO> selectLandArchiveList(LandArchiveSearchVO landArchiveSearchVO) {
		LOGGER.info("ServiceImpl - Call selectLandArchiveList.." + landArchiveSearchVO);
		return landArchiveDAO.selectLandArchiveList(landArchiveSearchVO);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectAreaList(String kind) {
		return landArchiveDAO.selectAreaList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectCadaMapList(String kind) {
		return landArchiveDAO.selectCadaMapList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectFigureList(String kind) {
		return landArchiveDAO.selectFigureList(kind); 
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectLandJosaList(String kind) {
		return landArchiveDAO.selectLandJosaList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectLandMoveList(String kind) {
		return landArchiveDAO.selectLandMoveList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectMeasureList(String kind) {
		return landArchiveDAO.selectMeasureList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectSurvMeasureList(String kind) {
		return landArchiveDAO.selectSurvMeasureList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectNoCorpList(String kind) {
		return landArchiveDAO.selectNoCorpList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectRexxamineList(String kind) {
		return landArchiveDAO.selectRexxamineList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectSpmsList(String kind) {
		return landArchiveDAO.selectSpmsList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectSurvChkSpmsList(String kind) {
		return landArchiveDAO.selectSurvChkSpmsList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectTopographicList(String kind) {
		return landArchiveDAO.selectTopographicList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectMSDataList(String kind) {
		return landArchiveDAO.selectMSDataList(kind);
	}

	@Override
	public List<LinkedHashMap<String, Object>> selectMSRQST(String kind) {
		return landArchiveDAO.selectMSDataList(kind);
	}

}
