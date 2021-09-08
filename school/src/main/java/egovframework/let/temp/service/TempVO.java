package egovframework.let.temp.service;

import java.io.Serializable;
import java.util.List;


public class TempVO implements Serializable {

    /** 검색조건 */
    private String tempId;

    /** 검색종료일 */
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

}