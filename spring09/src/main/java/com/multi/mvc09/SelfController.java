package com.multi.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelfController {
	@Autowired
	SelfDAO dao;
	
	@RequestMapping("insert10")
	public void insert10(SelfVO bag) {
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("delete10")
	public void delete10(String id) {
		System.out.println(dao);
		dao.delete(id);
	}
	
	@RequestMapping("update10")
	public void update10(SelfVO bag) {
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("one10")
	public void one10(String id , Model model) {
		System.out.println(dao);
		SelfVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list10")
	public void list(Model model) {
		List<SelfVO> list = dao.list();
		model.addAttribute("list", list);
	}

}
