package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml"); // xml
		
		TestBean1 test1 = ctx1.getBean("t1", TestBean1.class);
		TestBean2 test2 = ctx1.getBean("t2", TestBean2.class);
		
		System.out.println(test1);
		System.out.println(test2);
		
		test1.method1();
		test1.method2();
		test1.method3();
		test1.func1();
		test1.func3();
		
		test2.method4();
		test2.method5();

		ctx1.close();

	}
}
