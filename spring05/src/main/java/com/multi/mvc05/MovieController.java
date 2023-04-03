package com.multi.mvc05;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public void movie(MovieVO vo , Model model) {
		System.out.println(vo);
		model.addAttribute("vo",vo);
	}
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("배");
		list.add("포도");
		list.add("수박");
		model.addAttribute("list",list);
		
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("강원도");
		list.add("부산");
		list.add("경기도");
		list.add("제주도");
		model.addAttribute("list",list);
	}
}
