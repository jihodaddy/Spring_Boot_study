package com.boot.projectEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boot.projectEx.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	
	
	
}
