package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;
	
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
	public void one2(int no) {
		System.out.println(dao);
		dao.one(no);
	}
	
	@RequestMapping("list2")
	public void list2() {
		
	}

}
