package com.multi.mvc06;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	
	
	@RequestMapping("insert2")
	public void insert2(BbsVO bag) {
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("delete2")
	public void delete2(int no) {
		System.out.println(dao);
		dao.delete(no);
	}
	
	@RequestMapping("update2")
	public void update2(BbsVO bag) {
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("one2")
	public void one2(int no,Model model) {
		System.out.println(dao);
		BbsVO bag = dao.one(no);
		//bbs상세페이지 만들떄 , reply list도 함께 가지고 와야함
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list",list);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list2")
	public void list2(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one6")
	public void one6(int no,Model model) {
		System.out.println(dao);
		BbsVO bag = dao.one(no);
		//bbs상세페이지 만들떄 , reply list도 함께 가지고 와야함
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list",list);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("fDelete")
	public void fDelete(BbsVO bag) {
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	
	

}
