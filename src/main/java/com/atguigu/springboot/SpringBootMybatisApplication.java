package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement	// 开启声明式事务
@MapperScan("com.atguigu.springboot.mapper")
@ServletComponentScan	//  扫描web组件
						//监听器 @WebListener
						//过滤器 @WebFilter(urlPatterns="/*")
						//Servlet @WebServlet(urlPatterns="/my")
@SpringBootApplication
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

}
