package egovframework.let.temp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface TempService {
	public TempVO selectTemp(TempVO searchVO) throws Exception;
	
	//임시데이터 목록
	public List<EgovMap> list(TempVO searchVO) throws Exception;
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO searVO) throws Exception;

	//임시데이터 추가
	//public void insertTemp(TempVO searchVO) throws Exception;

	
	//임시데이터 수정
	public void updateTemp(TempVO searchVO) throws Exception;

	//임시데이터 삭제
	public void deleteTemp(TempVO searchVO) throws Exception;

	public List<EgovMap> selectTempList(TempVO searchVO) throws Exception;

	public void insertTemp(TempVO searchVO) throws Exception;
	
	/*public List<TempVO> list() throws Exception;*/

}
