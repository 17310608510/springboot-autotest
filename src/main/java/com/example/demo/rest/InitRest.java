package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月11日 下午5:27:58 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@RestController
public class InitRest {
	private static Logger logger = LoggerFactory.getLogger(InitRest.class);
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello，greetings from sprint-boot2-autotest";
	}
}
