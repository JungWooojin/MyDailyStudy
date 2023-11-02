package component.landArchive.service;

import ldk.util.string.FieldToStringHelper;

public class LandArchiveResultItemVO {
	private String cat2;
	private String cat3;
	private String serial;
	private String file_name;
	
	//Cat3이 null이면 Cat2를 리턴
	public String getCat3() {
		if(this.cat3==null || this.cat3.equals("")) {
			return cat2;
		}
		return cat3;
	}
	
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getCat2() {
		return cat2;
	}
	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}
	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	@Override
	public String toString() {
		return FieldToStringHelper.getInstance().toString(this);
	}
}