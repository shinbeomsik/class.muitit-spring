package com.multi.mvc06;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	@RequestMapping("test1")
	public  void one(String id , Model model) {
		System.out.println(id);
		ProductVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("test2")
	public  void list(Model model) {
		ArrayList<ProductVO> list = dao.list();
		model.addAttribute("list",list);
	}
}
