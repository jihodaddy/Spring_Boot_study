package com.boot.projectEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	//index 페이지로 이동
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	
}
