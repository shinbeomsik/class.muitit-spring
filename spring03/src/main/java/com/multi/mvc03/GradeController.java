package com.multi.mvc03;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeController {
	
	@Autowired
	GradeDAO dao;
	
	@RequestMapping("insert4")
	public void insert(GradeVO bag) {
		dao.insert(bag);
	}
	
	@RequestMapping("one4")
	public void one(int id, Model model) {
		GradeVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	
	
	@RequestMapping("list4")
	public void list(Model model) {
		ArrayList<GradeVO> list = dao.list();
		model.addAttribute("list", list);
		
		
	}
	
}
