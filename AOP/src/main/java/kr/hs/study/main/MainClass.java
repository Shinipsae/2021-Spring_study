package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml"); // xml
		
		TestBean1 test1 = ctx1.getBean("t1", TestBean1.class);
		System.out.println(test1);
		test1.method3();

		ctx1.close();

	}
}
