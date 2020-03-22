package com.atguigu.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.AdminMapper;
import com.atguigu.springboot.service.TAdminService;
@Transactional
@Service
public class TAdminServiceImpl implements TAdminService {
	
	@Autowired
	private AdminMapper adminMapper; 	//开启事务，使用jdk动态代理

	@Transactional(readOnly=true) // 根据就近原则
	@Override
	public TAdmin getAdminById(Integer id) {
		System.out.println("+++++> > > "+adminMapper.getClass());
		return adminMapper.getAdminById(id);
	}

}
