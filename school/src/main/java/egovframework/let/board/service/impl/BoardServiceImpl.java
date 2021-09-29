package egovframework.let.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.board.service.BoardService;
import egovframework.let.board.service.BoardVO;
import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.cmmn.exception.FdlException;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService{
	
	@Resource(name = "egovBoardIdGnrService")
	protected EgovIdGnrService idgenService;
	
	@Resource(name = "boardMapper")
	private BoardMapper boardMapper;
	
	//게시물 목록 가져오기
	@Override
	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception{
		return boardMapper.selectBoardList(vo);
	}
	
	//게시물 목록수
	public int selectBoardListCnt(BoardVO vo) throws Exception{
		return boardMapper.selectBoardListCnt(vo);
	}

/*	@Override
	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	//게시물 상세정보
	@Override
	public BoardVO selectBoard(BoardVO vo) throws Exception {
		// 조회수 업
		boardMapper.updateViewCnt(vo);
		
		return boardMapper.selectBoard(vo);
	}
	
	//게시물 등록
	@Override
	public String insertBoard(BoardVO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setBoardId(id);
		boardMapper.insertBoard(vo);
		return id;
	}
	
	//게시물 수정하기
	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		boardMapper.updateBoard(vo);
	}
	
	//게시물 삭제하기
	@Override
	public void deleteBoard(BoardVO vo) throws Exception {
		boardMapper.deleteBoard(vo);
	}
	
	
	
	
	/*@Override
	public TempVO selectTemp(TempVO vo) throws Exception{
		boardMapper.updateViewCnt(vo);
		return boardMapper.selectBoard(vo);
	}
	
	public String insertTemp(TempVO vo) throws Exception{
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		System.out.print(id);
		tempMapper.insertTemp(vo);
		
		return id;
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
		return tempMapper.selectTempList(vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO vo) throws Exception {
		return tempMapper.selectTempListCnt(vo);
	}
	
	//임시데이터 수정하기
	public void updateTemp(TempVO vo) throws Exception{
		tempMapper.updateTemp(vo);
	}
	
	//임시데이터 삭제하기
	public void deleteTemp(TempVO vo) throws Exception{
		tempMapper.deleteTemp(vo);
	}*/

	


}
