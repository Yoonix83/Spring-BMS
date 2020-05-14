package org.bms.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)

//Test for Controller
@WebAppConfiguration

@ContextConfiguration({
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardControllerTests {
	
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	
	//가짜 mvc. 가짜로 URL 과 파라미터등을 브라우저에서 사용하는 것 처럼 만들어서 Controller를 실행해 볼 수 있음
	private MockMvc mockMvc; 
	
	@Before //모든 JUnit의 @Test 전에 매번 먼저 실행되는 메소드가 된다.
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test // 전체 목록
	public void testList() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn().getModelAndView().getModelMap());
		
//		INFO : org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - Mapped "{[/board/list],methods=[GET]}" onto public void org.zerock.controller.BoardController.list(org.springframework.ui.Model)
//		INFO : org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - Mapped "{[/],methods=[GET]}" onto public java.lang.String org.zerock.controller.HomeController.home(java.util.Locale,org.springframework.ui.Model)
//		INFO : org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@1f28c152: startup date [Wed Oct 02 20:57:37 KST 2019]; root of context hierarchy
//		INFO : org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@1f28c152: startup date [Wed Oct 02 20:57:37 KST 2019]; root of context hierarchy
//		INFO : org.springframework.web.servlet.handler.SimpleUrlHandlerMapping - Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
//		INFO : org.springframework.mock.web.MockServletContext - Initializing Spring FrameworkServlet ''
//		INFO : org.springframework.test.web.servlet.TestDispatcherServlet - FrameworkServlet '': initialization started
//		INFO : org.springframework.test.web.servlet.TestDispatcherServlet - FrameworkServlet '': initialization completed in 60 ms

	}
	
	/*
	@Test // 조회
	public void testGet() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
				.param("bno", "10"))
				.andReturn().getModelAndView().getModelMap());
		
//		INFO : org.zerock.controller.BoardControllerTests - {board=BoardVO(bno=10, title=MockMvc Modify Test, content=MockMvc Modify Content, writer=MockMvc, regdate=Wed Sep 25 17:29:48 KST 2019, updateDate=Thu Oct 03 02:12:46 KST 2019)
//		, org.springframework.validation.BindingResult.board=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
		
	}
	
	@Test // 등록
	public void testRegister() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "MockMvc Title test")
				.param("content", "MockMvc Content test")
				.param("writer", "MockMvc")).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
		
//		INFO : jdbc.sqltiming - insert into tbl_board (bno, title, content, writer) values (23, 'MockMvc Title test', 'MockMvc 
//				Content test', 'MockMvc') 
//				 {executed in 17 msec}
//				INFO : jdbc.audit - 1. PreparedStatement.execute() returned false
//				INFO : jdbc.audit - 1. PreparedStatement.getUpdateCount() returned 1
//				INFO : jdbc.audit - 1. PreparedStatement.isClosed() returned false
//				INFO : jdbc.audit - 1. PreparedStatement.close() returned 
//				INFO : jdbc.audit - 1. Connection.clearWarnings() returned 
//				INFO : org.zerock.controller.BoardControllerTests - redirect:/board/list
	}
	
	@Test // 수정
	public void testModify() throws Exception {
		
			String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
					.param("bno", "10")
					.param("title", "MockMvc Modify Test")
					.param("content", "MockMvc Modify Content")
					.param("writer", "MockMvc"))
				.andReturn().getModelAndView().getViewName();
			
			log.info(resultPage);
			
//			INFO : jdbc.sqltiming - update tbl_board set title= 'MockMvc Modify Test', content= 'MockMvc Modify Content', writer= 
//					'MockMvc', updateDate= sysdate where bno= 10 
//					 {executed in 1 msec}
//					INFO : jdbc.audit - 1. PreparedStatement.execute() returned false
//					INFO : jdbc.audit - 1. PreparedStatement.getUpdateCount() returned 1
//					INFO : jdbc.audit - 1. PreparedStatement.isClosed() returned false
//					INFO : jdbc.audit - 1. PreparedStatement.close() returned 
//					INFO : jdbc.audit - 1. Connection.clearWarnings() returned 
//					INFO : org.zerock.controller.BoardControllerTests - redirect:/board/list
			
	}
	
	
	@Test // 삭제
	public void testRemove() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "11")
				).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
		
//		INFO : jdbc.sqltiming - delete tbl_board where bno = 11 
//				 {executed in 3 msec}
//				INFO : jdbc.audit - 1. PreparedStatement.execute() returned false
//				INFO : jdbc.audit - 1. PreparedStatement.getUpdateCount() returned 1
//				INFO : jdbc.audit - 1. PreparedStatement.isClosed() returned false
//				INFO : jdbc.audit - 1. PreparedStatement.close() returned 
//				INFO : jdbc.audit - 1. Connection.clearWarnings() returned 
//				INFO : org.zerock.controller.BoardControllerTests - redirect:/board/list
	}

	@Test
	public void testListPaging() throws Exception {
		
		log.info(mockMvc.perform(
				MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "2")
				.param("amount", "10")
				).andReturn().getModelAndView().getModelMap()
				);
	}
	*/

}
