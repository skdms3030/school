package egovframework.let.temp.service.Impl;

import java.util.List;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("tempMapper")
public interface TempMapper {
	TempVO selectTemp(TempVO searchVO) throws Exception;
	
	//임시데이터 추가
	//void insertTemp(TempVO searchVO) throws Exception;
	void insertTemp(TempVO searchVO) throws Exception;
	
	//임시데이터 목록
	List<EgovMap> listTemp(TempVO searchVO) throws Exception;
	
	//임시데이터 목록 수
	int selectTempListCnt(TempVO searchVO) throws Exception;
	
	//임시데이터 수정하기
	void updateTemp(TempVO searchVO) throws Exception;
	
	//임시 데이터 삭제하기
	void deleteTemp(TempVO searchVO) throws Exception;

	List<EgovMap> selectTempList(TempVO searchVO) throws Exception;

	

	

	/*List<TempVO> list() throws Exception;*/


}
