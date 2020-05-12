package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.bms.domain.BoardVO;
import org.bms.domain.Criteria;
import org.bms.service.BoardService;
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
public class BoardServiceTest {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		
//		log.info(service); //BoardService 객체 정상 동작하는지 확인하기 위해 테스트
//		assertNotNull(service); 
//		
//		//INFO : org.zerock.service.BoardServiceTest - org.zerock.service.BoardServiceImpl@604f2bd2
//	}
//	
//	@Test
//	public void testRegister() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("BoardServieTest title 1");
//		board.setContent("BoardServieTest content 1");
//		board.setWriter("testNewbie");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물 번호 : " + board.getBno());
//		
////		INFO : jdbc.sqltiming - insert into tbl_board (bno, title, content, writer) values (19, 'BoardServieTest title 1', 
////				'BoardServieTest content 1', 'testNewbie') 
////		INFO : org.zerock.service.BoardServiceTest - 생성된 게시물 번호 : 19
//		
//	}
//	
	@Test
	public void testGetList() {
		
		//service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2,10)).forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testGet() {
//		
//		log.info(service.get(10L)); // 게시물 번호(bno) 10번 조회하기
//	
////		INFO : jdbc.resultsettable - 
////		|----|-------|--------|-------|----------------------|----------------------|
////		|bno |title  |content |writer |regdate               |updatedate            |
////		|----|-------|--------|-------|----------------------|----------------------|
////		|10  |테스트 제목 |테스트 내용  |user00 |2019-09-25 17:29:48.0 |2019-09-25 17:29:48.0 |
////		|----|-------|--------|-------|----------------------|----------------------|
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		// 게시물 번호의 존재 여부를 확인하고 테스트할 것
//		log.info("REMOVE RESULT:   " + service.remove(14L));
//	
//	}
//	
//	@Test
//	public void testUpdate() {
//		
//		BoardVO board = service.get(10L);
//		
//		if(board == null) {
//			log.info("bno 값이 없음");
//			return;
//		}
//		
//		board.setTitle("Update for Service TEST");
//		log.info("Modify Result :  " + service.modify(board));
//		
//		
//	}

}
