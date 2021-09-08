package egovframework.let.temp;

import java.io.Serializable;

public class TempVO implements Serializable{
	
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
