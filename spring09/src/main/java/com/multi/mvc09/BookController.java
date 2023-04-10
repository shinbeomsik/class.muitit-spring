package com.multi.mvc09;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BookController {
	
	@Autowired
	BookDAO dao; // 전역변수(글로벌변수)


	
	@RequestMapping("insert3.multi")
	public void insert(BookVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
		
	}
	
	@RequestMapping("one3.multi")
	public void one(String id , Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		BookVO bag = dao.one(id);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list3.multi")
	public void list(Model model) {
		List<BookVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}
