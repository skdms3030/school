package egovframework.let.rsv.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.rsv.service.ReservationApplyVO;
import egovframework.let.rsv.service.ReservationService;
import egovframework.let.rsv.service.ReservationVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("reservationServiceApply")
public class ReservationApplyServiceImpl extends EgovAbstractServiceImpl implements ReservationApplyService{
	

    @Resource(name = "propertiesService")
    protected EgovPropertyService propertyService;
    
    @Resource(name="reservationApplyMapper")
	private ReservationMapper reservationApplyMapper;
    
    @Resource(name = "egovRsvIdGnrService")
    private EgovIdGnrService idgenService;
    
    @Resource(name = "reservationService")
    private ReservationService reservationService;
    
    
    //예약자 등록하기
    @Override
    public ReservationApplyVO insertReservationApply(ReservationApplyVO vo) throws Exception {
    	//신청 인원 체크
    	ReservationVO reservationVO = new ReservationVO();
    	reservationVO.setResveId(vo.getResveId());
    	ReservationVO result = reservationService.selectReservation(reservationVO);
    	if(result.getMaxAplyCnt()<= result.getApplyCnt()) {
    		vo.setErrorCode("ERROR-R1");
    		vo.setMessage("마감되었습니다");
    	}else {
    		//기존 신청여부
    		if(reservationApplyMapper.duplicateApplyCheck(vo)>0) {
    			vo.setErrorCode("EEORE-R2");
    			vo.setMessage("이미 해당 프로그램 예약이 되어져 있습니다.");
    		}else {
    			String id = idgenService.getNextStringId();
    			vo.setReqstId(id);
    			reservationApplyMapper.insertReservation(vo);
    		}
    	}
    	return vo;
    }
    
    
    //예약자 목록 가져오기
    @Override
    public List<EgovMap> selectReservationApplyList(ReservationAppplyVO vo) throws Exception{
    	return reservationApplyMapper.selectReservationApplyList(vo);
    }
    
    //예약자 목록 수
    @Override
    public int selectReservationApplyListCnt(ReservationApplyVO vo) throws Exception{
    	return reservationApllyMapper.selectReservationApply(vo);
    }
    
    //예약자 상세 정보
    @Override
    public ReservationApllyVO selectReservationApply(ReservationApplyVO vo) throws Exception{
    	return reservationApplyMapper.selectReservationApply(vo);
    }
    
    //예약자 수정하기
    @Override
    public void updateReservationApply(ReservationApplyVO vo) throws Exception{
    	reservationApplyMapper.updateReservation(vo);
    }
    
    //예약자 삭제하기
    @Override
    private void deleteReservationApply(ReservationApplyVO vo) throws Exception {
    	reservationApplyMapper.deleteReservation(vo);
	}
    
    //예약자 승인처리
    @Override
    public void updateReservationConfirm(ReservationApplyVO vo) throws Exception {
    	reservationApplyMapper.updateReservation(vo);
    }
    
    //예약가능여부 확인
    @Override
    public ReservationApplyVO resvCheck(ReservationApplyVO vo) throws Exception {
    	//신청 인원 체크
    	ReservationVO reservationVO = new ReservationVO();
    	reservationVO.setResveId(vo.getResveId());
    	ReservationVO result = reservationService.selectReservation(reservationVO);
    	if(result.getMaxAplyCnt() <= result.getApplyCnt()) {
    		vo.setErrorCode("ERROR-R1");
    		vo.setMessage("마감되었습니다");
		}else {
			String id = idgenService.getNextStringId();
			vo.setReqstId(id);
			reservationApplyMapper.insertReservation(vo);
		}
    }
    
    
    
    
    
    
    
    
    
    //게시물 목록 가져오기
  	@Override
  	public List<EgovMap> selectReservationList(ReservationVO vo) throws Exception {
  		return reservationApplyMapper.selectReservationList(vo);
  	}
  	
  	//게시물 목록 수
  	@Override
  	public int selectReservationListCnt(ReservationVO vo) throws Exception {
  		return reservationApplyMapper.selectReservationListCnt(vo);
  	}
  	
    //게시물 상세정보
  	@Override
	public ReservationVO selectReservation(ReservationVO vo) throws Exception {
		return reservationApplyMapper.selectReservation(vo);
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
