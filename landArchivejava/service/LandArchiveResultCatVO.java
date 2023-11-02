package component.landArchive.service;

import java.util.List;

import ldk.util.string.FieldToStringHelper;

public class LandArchiveResultCatVO {
	private String cat1;
	private List<LandArchiveResultItemVO> landArchiveResultItemList;
	
	public String getCat1() {
		return cat1;
	}

	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public List<LandArchiveResultItemVO> getLandArchiveResultItemList() {
		return landArchiveResultItemList;
	}

	public void setLandArchiveResultItemList(List<LandArchiveResultItemVO> landArchiveResultItemList) {
		this.landArchiveResultItemList = landArchiveResultItemList;
	}

	@Override
	public String toString() {
		return FieldToStringHelper.getInstance().toString(this);
	}
}