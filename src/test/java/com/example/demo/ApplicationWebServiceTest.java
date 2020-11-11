package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.DemoService;

import junit.framework.TestCase;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月11日 下午6:16:21 
 * @version 1.0 
 * @parameter 
 * @since 普通业务服务层测试
 * @return 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootAutotestApplication.class) // 指定启动类
public class ApplicationWebServiceTest {
	protected static Logger logger = LoggerFactory.getLogger(ApplicationWebServiceTest.class);

	@Autowired
	private DemoService demoService;

	/**
	 * 测试方法
	 * 
	 * @throws Exception
	 */
	@Test
	public void testService() throws Exception {
		// 检查入口配置是否正确
		String result = this.demoService.sayHello();
		logger.info("实际返回结果result=" + result);

		TestCase.assertNotNull(result);
		String expected = "hello from service layer";
		TestCase.assertEquals(expected, result);
	}
}
