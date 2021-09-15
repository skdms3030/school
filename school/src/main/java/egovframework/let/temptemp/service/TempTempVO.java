package egovframework.let.temptemp.service;

import java.io.Serializable;
import java.util.List;

import egovframework.com.cmm.ComDefaultVO;

public class TempTempVO extends ComDefaultVO implements Serializable{
	private String tempId;
	private String tempVal;
	private List<String> tempList;
	
	
	
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	public String getTempVal() {
		return tempVal;
	}
	public void setTempVal(String tempVal) {
		this.tempVal = tempVal;
	}
	public List<String> getTempList() {
		return tempList;
	}
	public void setTempList(List<String> tempList) {
		this.tempList = tempList;
	}
}
