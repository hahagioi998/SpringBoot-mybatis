package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@GetMapping("hello")
	public String hello() {
		return "Hello World ~~~~!!!";
	}
	

	@ResponseBody
	@GetMapping("name")
	public String name() {
		return "张俊超";
	}
}
