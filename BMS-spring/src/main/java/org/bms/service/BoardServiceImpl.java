package org.bms.service;

import java.util.List;

import org.bms.domain.BoardVO;
import org.bms.domain.Criteria;
import org.bms.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	
	
	private BoardMapper mapper;
	
	
	
	@Override
	public void register(BoardVO board) {
	
		mapper.insertSelectKey(board);
		
	}

	
	@Override
	public BoardVO get(long bno) {
		
		log.info("get............" + bno);
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		
		log.info("modify........" + board);
		
		return mapper.update(board) == 1; 
	}

	@Override
	public boolean remove(long bno) {
		
		log.info("remove............" + bno);
		
		return mapper.delete(bno) == 1;
		
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		log.info(">> BoardServiceImpl getList.... : " + cri);
		
		return mapper.getListWithPaging(cri);
	}
	
	@Override
	public int getTotal(Criteria cri) {
		
		log.info("get total count");
		
		return mapper.getTotalCount(cri);
	}
	


}
