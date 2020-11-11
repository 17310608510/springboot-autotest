package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月11日 下午5:46:39 
 * @version 1.0 
 * @parameter 
 * @since 普通Java测试，比如配置参数加载，静态方法返回值等
 * @return 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ApplicationJavaTest.class }) // 指定启动类
public class ApplicationJavaTest {
	protected static Logger logger = LoggerFactory.getLogger(ApplicationJavaTest.class);

	@Test
	public void testOne() {
		logger.info("test hello 1");
	}

	@Test
	public void testTwo() {
		logger.info("test hello 2");
		TestCase.assertEquals(1, 1);
	}

	@Before
	public void testBefore() {
		logger.info("before");
	}

	@After
	public void testAfter() {
		logger.info("after");
	}
}
