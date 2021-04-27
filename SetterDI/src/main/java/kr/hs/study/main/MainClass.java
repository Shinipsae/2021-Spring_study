package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = // IOC 컨테이너의 일종
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class); // 주소값을 가져옴
		System.out.println("t1: " + t1);
		
		TestBean1 t2 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("t2: " + t2);
		
		TestBean1 t4 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t4: " + t4);
		
		TestBean1 t6 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t6: " + t6);
		
		ctx.close();
	}

	
}
