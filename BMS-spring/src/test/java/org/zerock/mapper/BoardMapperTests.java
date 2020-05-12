package org.zerock.mapper;

import java.util.ArrayList;
import java.util.List;

import org.bms.domain.BoardVO;
import org.bms.domain.Criteria;
import org.bms.mapper.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
//	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach( board -> log.info(board));
//		
//
//	}
//	
//	//insert 문 실행 되고 PK 값을 알아야 하는지(insertSeletkey()) 몰라도 되는지 차이(insert()).
//	@Test
//	public void testInsert() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("new Title 1");
//		board.setContent("new Content 1");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		// mapper.insert(board) 동작 방식
//	    // mapper = BoardMapper interface / insert() = interface method / board = BoardVO 객체의 속성 값들 
//		// 1. xml에서 <mapper namespace="org.zerock.mapper.BoardMapper"> 안에 해당 메소드와 [동일한 글자가있는지 확인]
//		// 2. 동일한 글자가 있다면  board 에 들어가 있는 속성 값들을 xml의 속성(컬럼)값의 파라미터로 넘김.
//	
//		log.info(board); // bno 멤버 변수 값 확인을 위해
//		//INFO : org.zerock.mapper.BoardMapperTests - BoardVO(bno=null, title=new Title 1, 
//		//									content=new Content 1, writer=newbie, regdate=null, updateDate=null)
//		// database=>     14	new Title 1	new Content 1	newbie	19/09/28	19/09/28
//		// 실제 database 엔 bno 값이 제대로 들어가있지만 bno의 값은 알 수 없다.
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("new Title 2 select key");
//		board.setContent("new Content 2 select key");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//		//INFO : jdbc.sqltiming - select seq_board.nextval from dual {executed in 87 msec}
//		// xml selectkey sql 문 우선 실행
//		//INFO : org.zerock.mapper.BoardMapperTests - BoardVO(bno=16, title=new Title 2 select key, 
//		//							content=new Content 2 select key, writer=newbie, regdate=null, updateDate=null)
//		//database=>  16	new Title 2 select key	new Content 2 select key	newbie	19/09/28	19/09/28
//		// 실제 databse 에도 잘 들어갔고 PK인 bno 값도 얼마인지 확인 해볼 수 있다.
//		 
//	}
//	
//	
//	@Test
//	public void testRead() {
//		
//		// Mybatis 의 모든 파라미터와 리턴 타입의 처리는 get파라미터명(), set컬럼명()의 규칙으로 호출 되지만 , 
//		// #{속성} 처럼 1개만 존재하는 경우는 별도의 get파라미터명()을 사용하지 않는다.
//		
//		// 기존 처럼 사용하는 경우
////				 BoardVO board = new BoardVO();
////				 board.setBno(5L);
////				 mapper.read(board.getBno());
//		
//		// 속성 1개만 존재하는 경우
//		BoardVO board = mapper.read(5L);
//			
//		log.info(board);
//		
////		INFO : jdbc.audit - 1. PreparedStatement.setLong(1, 5) returned  << 정상적으로 set 됨 >>
////		INFO : jdbc.sqlonly - select * from tbl_board where bno = 5  << 정상적으로 sql 실행 >>	
////		INFO : jdbc.resultsettable -  << Oracle 에서 나온 결과 값 >>
////		|----|-------|--------|-------|----------------------|----------------------|
////		|bno |title  |content |writer |regdate               |updatedate            |
////		|----|-------|--------|-------|----------------------|----------------------|
////		|5   |테스트 제목 |테스트 내용  |user00 |2019-09-25 17:29:44.0 |2019-09-25 17:29:44.0 |
////		|----|-------|--------|-------|----------------------|----------------------|
//	}
//	
//	
//	@Test
//	public void testDelete() {
//		log.info("[ DELETE COUNT : " + mapper.delete(3L) + " ]");
//
////		INFO : org.zerock.mapper.BoardMapperTests - DELETE COUNT : 1
//	}
//	
//	
//	@Test
//	public void testUpdate() {
//		
//		BoardVO board = new BoardVO();
//		board.setBno(5L);
//		board.setTitle("Modify Title #1");
//		board.setContent("Modify Content #1");
//		board.setWriter("user00");
//		
//		int cnt = mapper.update(board); 
//		
//		log.info("[ Update Count : " + cnt + " ]");
//		//INFO : jdbc.sqlonly - update tbl_board set title= 'Modify Title #1', content= 'Modify Content #1', 
//		//writer= 'user00', updateDate= sysdate where bno= 5 
//		//INFO : org.zerock.mapper.BoardMapperTests - [ Update Count : 1 ]
//	}
//	
	
	@Test
	public void testPaging() {
		
		Criteria cri = new Criteria();
		// 10개씩 3페이지
//		cri.setPageNum(2);
//		cri.setAmount(10);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testSearch() {
//		
//		Criteria cri = new Criteria();
//		cri.setKeyword("새로");
//		cri.setType("TC");
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//		
//	}
//	
}
