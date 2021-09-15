package egovframework.let.temptemp.service.impl;

import java.util.List;

import egovframework.let.temptemp.service.TempTempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface TempTempMapper{
	
	//리스트 출력
	List<TempTempVO> selectList(TempTempVO searchVO) throws Exception; 
}
