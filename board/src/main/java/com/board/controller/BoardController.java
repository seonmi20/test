package com.board.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	
	@Inject
	BoardService service;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void getList(Model model) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		//List<BoardVO> list = null;
		//list = service.list();
		
		BoardVO vo = new BoardVO();
		
		vo.setBno(1);
		vo.setTitle("제목임");
		vo.setContent("안녕하세요 안녕하세요 안녕하세요 안녕하세요 안녕하세요");	
		vo.setWriter("네오");
		
		Date nowDate = new Date(); 
		System.out.println("포맷 지정 전 : " + nowDate); 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

		//원하는 데이터 포맷 지정 String strNowDate = simpleDateFormat.format(nowDate);
		String strNowDate = simpleDateFormat.format(nowDate); 
		//지정한 포맷으로 변환 System.out.println("포맷 지정 후 : " + strNowDate);
		System.out.println("포맷 지정 후 : " + strNowDate);

		vo.setRegDate(nowDate);
		vo.setViewCnt(1);	
		
		list.add(vo);
		
		list.get(0);
		System.out.println(list.get(0).toString());
		
		model.addAttribute("list", list);		
	}
	
	
	
	
	
	
}
