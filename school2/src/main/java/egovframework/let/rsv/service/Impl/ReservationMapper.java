package egovframework.let.rsv.service.Impl;

import java.util.List;

import egovframework.let.rsv.service.ReservationVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("reservationMapper")
public interface ReservationMapper {
	
	//게시물 목록 가져오기
		List<EgovMap> selectReservationList(ReservationVO vo) throws Exception;
		
		//게시물 목록 수
		int selectReservationListCnt(ReservationVO vo) throws Exception;
			
		//게시물 상세정보
		ReservationVO selectReservation(ReservationVO vo) throws Exception;
		
		//게시물 등록
		void insertReservation(ReservationVO vo) throws Exception;
		
		//게시물 수정하기
		void updateReservation(ReservationVO vo) throws Exception;
		
		//게시물 삭제하기
		void deleteReservation(ReservationVO vo) throws Exception;
		

}
