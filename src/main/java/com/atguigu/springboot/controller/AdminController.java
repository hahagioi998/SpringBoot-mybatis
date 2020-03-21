package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.SynchronossPartHttpMessageReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.service.TAdminService;

@RestController
public class AdminController {

	@Autowired
	private TAdminService adminService;
	
	@GetMapping("/getAdminById/{id}")
	public TAdmin getAdminById(@PathVariable("id")Integer id) {
		TAdmin adminById = adminService.getAdminById(id);
		System.out.println(adminById);
		return adminById;
		
	}
}
