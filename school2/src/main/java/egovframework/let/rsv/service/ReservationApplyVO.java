package egovframework.let.rsv.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class ReservationApplyVO extends ReservationVO implements Serializable{
		//예약ID
		private String resveId;
		//예약자ID
		private String reqstId;
		//신청구분코드
		private String resveDe;
		//신청다 명
		private String chargerNm;
		//연락처
		private String telno;
		//이메일
		private String email;
		/*
		 * R : 접수
		 * O : 승인완료
		 * X : 반려
		 */
		private String confmSeCode;
		//승인자ID
		private String confmerId;
		//반려사유
		private String returnResn;
		//승인일자
		private java.util.Date conrmPnttm;
		//등록IP
		private String creatIp;
		//사용여부
		private String useAt;
		//최초등록시점
		private java.util.Date frstUpdtnPnttm;
		//최초 등록자 ID
		private String frstRegisterId;
		//최종수정시점
		private java.util.Date lastUpdtPnttm;
		//최종수정자 ID
		private String lsatUpdusrId;
		//사용자 ID
		private String userId;
		//관리자여부
		private String mngAt;
		//에러코드
		private String errorCode;
		//메세지
		private String message;
		
		
		
		
		
		public String getResveId() {
			return resveId;
		}
		public void setResveId(String resveId) {
			this.resveId = resveId;
		}
		public String getReqstId() {
			return reqstId;
		}
		public void setReqstId(String reqstId) {
			this.reqstId = reqstId;
		}
		public String getResveDe() {
			return resveDe;
		}
		public void setResveDe(String resveDe) {
			this.resveDe = resveDe;
		}
		public String getChargerNm() {
			return chargerNm;
		}
		public void setChargerNm(String chargerNm) {
			this.chargerNm = chargerNm;
		}
		public String getTelno() {
			return telno;
		}
		public void setTelno(String telno) {
			this.telno = telno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getConfmSeCode() {
			return confmSeCode;
		}
		public void setConfmSeCode(String confmSeCode) {
			this.confmSeCode = confmSeCode;
		}
		public String getConfmerId() {
			return confmerId;
		}
		public void setConfmerId(String confmerId) {
			this.confmerId = confmerId;
		}
		public String getReturnResn() {
			return returnResn;
		}
		public void setReturnResn(String returnResn) {
			this.returnResn = returnResn;
		}
		public java.util.Date getConrmPnttm() {
			return conrmPnttm;
		}
		public void setConrmPnttm(java.util.Date conrmPnttm) {
			this.conrmPnttm = conrmPnttm;
		}
		public String getCreatIp() {
			return creatIp;
		}
		public void setCreatIp(String creatIp) {
			this.creatIp = creatIp;
		}
		public String getUseAt() {
			return useAt;
		}
		public void setUseAt(String useAt) {
			this.useAt = useAt;
		}
		public java.util.Date getFrstUpdtnPnttm() {
			return frstUpdtnPnttm;
		}
		public void setFrstUpdtnPnttm(java.util.Date frstUpdtnPnttm) {
			this.frstUpdtnPnttm = frstUpdtnPnttm;
		}
		public String getFrstRegisterId() {
			return frstRegisterId;
		}
		public void setFrstRegisterId(String frstRegisterId) {
			this.frstRegisterId = frstRegisterId;
		}
		public java.util.Date getLastUpdtPnttm() {
			return lastUpdtPnttm;
		}
		public void setLastUpdtPnttm(java.util.Date lastUpdtPnttm) {
			this.lastUpdtPnttm = lastUpdtPnttm;
		}
		public String getLsatUpdusrId() {
			return lsatUpdusrId;
		}
		public void setLsatUpdusrId(String lsatUpdusrId) {
			this.lsatUpdusrId = lsatUpdusrId;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getMngAt() {
			return mngAt;
		}
		public void setMngAt(String mngAt) {
			this.mngAt = mngAt;
		}
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
		
}
