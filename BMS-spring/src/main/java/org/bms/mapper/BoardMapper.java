package org.bms.mapper;

import java.util.List;

import org.bms.domain.BoardVO;
import org.bms.domain.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO board);
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public int getTotalCount(Criteria cri); 
	
}
