package egovframework.let.temp;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class TempVO extends ComDefaultVO implements Serializable{
	//잘못된 파일입니다
	
	//임시데이터ID
	private java.lang.Integer tempId;
	
	//임시데이터값
	private String tempVal;
	
	public java.lang.Integer getTempId(){
		return tempId;
	}

	public String getTempVal() {
		return tempVal;
	}

	public void setTempVal(String tempVal) {
		this.tempVal = tempVal;
	}

	public void setTempId(java.lang.Integer tempId) {
		this.tempId = tempId;
	}
	
}
