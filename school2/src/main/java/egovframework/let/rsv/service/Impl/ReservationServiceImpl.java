package egovframework.let.rsv.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.rsv.service.ReservationService;
import egovframework.let.rsv.service.ReservationVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("reservationService")
public class ReservationServiceImpl extends EgovAbstractServiceImpl implements ReservationService{
	

    @Resource(name = "propertiesService")
    protected EgovPropertyService propertyService;
    
    @Resource(name="reservationMapper")
	private ReservationMapper reservationMapper;
    
    @Resource(name = "egovRsvIdGnrService")
    private EgovIdGnrService idgenService;
    
    //게시물 목록 가져오기
  	@Override
  	public List<EgovMap> selectReservationList(ReservationVO vo) throws Exception {
  		return reservationMapper.selectReservationList(vo);
  	}
  	
  	//게시물 목록 수
  	@Override
  	public int selectReservationListCnt(ReservationVO vo) throws Exception {
  		return reservationMapper.selectReservationListCnt(vo);
  	}
  	
    //게시물 상세정보
  	@Override
	public ReservationVO selectReservation(ReservationVO vo) throws Exception {
		return reservationMapper.selectReservation(vo);
	}
	
	//게시물 등록
	@Override
	public String insertReservation(ReservationVO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setResveId(id);
		reservationMapper.insertReservation(vo);
		
		return id;
	}
	
	//게시물 수정하기
	@Override
	public void updateReservation(ReservationVO vo) throws Exception {
		reservationMapper.updateReservation(vo);
	}
	
	//게시물 삭제하기
	@Override
	public void deleteReservation(ReservationVO vo) throws Exception {
		reservationMapper.deleteReservation(vo);
	}

	
	

}
