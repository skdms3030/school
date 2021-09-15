package egovframework.let.temptemp.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.let.temptemp.service.TempTempVO;
import egovframework.let.temptemp.service.TemptempService;

@Service
public class TempTempServiceImpl implements TemptempService {
	
	@Autowired
	private TempTempMapper temptempMapper;

	@Override
	public List<TempTempVO> selectList(TempTempVO vo) throws Exception {
		return temptempMapper.selectList(vo);
	}




}
