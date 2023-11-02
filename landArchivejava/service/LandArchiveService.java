package component.landArchive.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface LandArchiveService {
	public List<LandArchiveSearchVO> selectLandArchiveList (LandArchiveSearchVO landArchiveSearchVo);
	public List<LinkedHashMap<String, Object>> selectAreaList(String kind);
	public List<LinkedHashMap<String, Object>> selectCadaMapList(String kind);
	public List<LinkedHashMap<String, Object>> selectFigureList(String kind);
	public List<LinkedHashMap<String, Object>> selectLandJosaList(String kind);
	public List<LinkedHashMap<String, Object>> selectLandMoveList(String kind);
	public List<LinkedHashMap<String, Object>> selectMeasureList(String kind);
	public List<LinkedHashMap<String, Object>> selectSurvMeasureList(String kind);
	public List<LinkedHashMap<String, Object>> selectNoCorpList(String kind);
	public List<LinkedHashMap<String, Object>> selectRexxamineList(String kind);
	public List<LinkedHashMap<String, Object>> selectSpmsList(String kind);
	public List<LinkedHashMap<String, Object>> selectSurvChkSpmsList(String kind);
	public List<LinkedHashMap<String, Object>> selectTopographicList(String kind);
	public List<LinkedHashMap<String, Object>> selectMSDataList(String kind);
	public List<LinkedHashMap<String, Object>> selectMSRQST(String kind);

}
