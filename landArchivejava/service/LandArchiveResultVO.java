package component.landArchive.service;

import java.util.List;

import ldk.util.string.FieldToStringHelper;

public class LandArchiveResultVO {
	private String hjdon_name;
	private String jibun;
	private List<LandArchiveResultCatVO> landArchiveResultCatList;
	
	//행정동명이 없을경우 주소없음 표시			
	public String gethjdon_name() {
		if(this.hjdon_name == null || this.hjdon_name.trim().equals("")) {
			return "주소없음";
		}
		return hjdon_name;
	}

	//지번이 0일경우 공백 
	public String getJibun() {
		if(this.jibun != null && this.jibun.equals("0")) {
			return "";
		}
		return jibun;
	}

	public void sethjdon_name(String hjdon_name) {
		this.hjdon_name = hjdon_name;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public List<LandArchiveResultCatVO> getLandArchiveResultCatList() {
		return landArchiveResultCatList;
	}

	public void setLandArchiveResultCatList(List<LandArchiveResultCatVO> landArchiveResultCatList) {
		this.landArchiveResultCatList = landArchiveResultCatList;
	}

	@Override
	public String toString() {
		return FieldToStringHelper.getInstance().toString(this);
	}
}