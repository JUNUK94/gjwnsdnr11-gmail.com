package org.adt.mapper;

import java.util.List;

import org.adt.domain.BoardVO;
import org.adt.domain.Criteria;
import org.adt.domain.PlannerVO;

public interface BoardMapper {
	
	//게시판전체목록 가져오기
	public List<BoardVO> getBoardList(Criteria cri);
	
	//특정 게시글 가져오기
	public BoardVO read(Long bno);
	
	//게시판 전체 갯수 가져오기
	public int getTotalCount(Criteria cri);
	
	// 조회수 추가
	public void addBclickNum(Long bno);
	
	// 좋아요 추가
	public void addLike(Long bno);
	
	//좋아요 취소
	public void CnxLike(Long bno);
	
	//글수정
	public int update(BoardVO board);
	
	//글삭제
	public int delete(Long bno);
		
	
	//게시판글작성
	public void reviewInsert(BoardVO board);
	
	

}