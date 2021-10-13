package egovframework.let.temp.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;

	@Resource(name = "tempMapper")
	private TempMapper tempMapper;

	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
/*	@Resource(name = "tempDAO")
	private TempDAO tempDAO;*/
	
	@Override
	public TempVO selectTemp(TempVO searchVO) throws Exception {
		return tempMapper.selectTemp(searchVO);
	}

	@Override
	public List<EgovMap> list(TempVO searchVO) throws Exception {
		return tempMapper.listTemp(searchVO);
	}

	/*@Override
	public void insertTemp(TempVO searchVO) throws Exception {
		String id = idgenService.getNextStringId();
		searchVO.setTempId(id);
		tempMapper.insertTemp(searchVO);
	}*/
	@Override
	public void insertTemp(TempVO searchVO) throws Exception {
		searchVO.setTempId(idgenService.getNextStringId());
		tempMapper.insertTemp(searchVO);
	}
	
	
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO searchVO) throws Exception {
		return tempMapper.selectTempListCnt(searchVO);
	}

	@Override
	public void updateTemp(TempVO searchVO) throws Exception{
		tempMapper.updateTemp(searchVO);
	}

	@Override
	public void deleteTemp(TempVO searchVO) throws Exception {
		tempMapper.deleteTemp(searchVO);
	}

	@Override
	public List<EgovMap> selectTempList(TempVO searchVO) throws Exception {
		return tempMapper.selectTempList(searchVO);
	}


	/*@Override
	public List<TempVO> list() throws Exception {
		return tempMapper.list();
	}*/


	/*@Override
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempDAO.selectTemp(vo);
	}*/

}
