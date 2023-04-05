package com.multi.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
	
	@RequestMapping("jsonResponse5")
	@ResponseBody
	public  MapVO map() {
		MapVO bag = new MapVO();
		bag.setLat(37.555946);
		bag.setLon(126.972317);
		return bag;
		
	}
}
