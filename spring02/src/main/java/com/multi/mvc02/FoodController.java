package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("food")
	public String food(FoodVO bag) {
		System.out.println(bag);
		
		if (bag.getLike().equals("라면")) {
			return "like";
		}
		if (bag.getDislike().equals("커피")) {
			return "dislike";
		}
		if (bag.getLike().equals("아무거나")) {
			return "redirect:food.jsp";
		}else {
			return "redirect:food.jsp";
			
		}
	}
}
