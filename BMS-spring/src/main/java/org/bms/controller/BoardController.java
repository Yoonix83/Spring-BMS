package org.bms.controller;

import org.bms.domain.BoardVO;
import org.bms.domain.Criteria;
import org.bms.domain.PageDTO;
import org.bms.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor 
public class BoardController {
	
	private BoardService service; 
	
	@GetMapping("/list") 
	public void list(Criteria cri, Model model) {
		
		log.info("++++++++++++/list 호출");
		model.addAttribute("list", service.getList(cri));
		
		int total = service.getTotal(cri); 
		
		model.addAttribute("pageMaker", new PageDTO(cri, total)); 
	
	}
	
	@GetMapping({"/get","/modify"}) 
	public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		
		log.info("++++++++++++++++++++++++++/get or /modify");
		model.addAttribute("board", service.get(bno));
		
		
	}
	
	@PostMapping("/register") 
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		log.info("++++++++++++register : " + board);
		
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list"; 
	}
	
	@GetMapping("/register") 
	public void register() {
		// 입력 페이지를 보여주는 역할만 하기 때문에 별도 처리 필요 없음	
	}
	
	
	@PostMapping("/modify") 
	public String modify(BoardVO board,@ModelAttribute("cri") Criteria cri ,RedirectAttributes rttr) {
		
		log.info("modify : " + board);
		
		if(service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		
	
		log.info(" 페이지 번호, 수량 확인 : " + cri.getPageNum() +" , " + cri.getAmount());
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno,@ModelAttribute("cri") Criteria cri , RedirectAttributes rttr) {
		
		log.info("+++++++++++++remove ......" + bno);
		
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:/board/list";
		

	}
	

}
