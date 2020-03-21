package com.atguigu.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.AdminMapper;
import com.atguigu.springboot.service.TAdminService;

@Service
public class TAdminServiceImpl implements TAdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public TAdmin getAdminById(Integer id) {
		return adminMapper.getAdminById(id);
	}

}
