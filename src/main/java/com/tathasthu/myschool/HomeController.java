package com.tathasthu.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

	@GetMapping("/index")
	public String getIndex()
	{
		return "index";
	}
}
