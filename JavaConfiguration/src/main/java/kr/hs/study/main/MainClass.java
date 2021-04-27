package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 =
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class); // xml
		TestBean2 t5 = ctx1.getBean("obj5", TestBean2.class); // xml
		TestBean2 t6 = ctx1.getBean("obj6", TestBean2.class); // xml
		
		TestBean3 t7 = ctx1.getBean("t1", TestBean3.class);
		
		System.out.println("t1: " + t1);
		System.out.println("----------------------------------");
		System.out.println("t3: " + t5);
		System.out.println("----------------------------------");
		System.out.println("t7: " + t7);
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean2 t2 = ctx2.getBean("obj2", TestBean2.class); // java (constructor)
		TestBean2 t3 = ctx2.getBean("obj3", TestBean2.class); // java
		TestBean2 t4 = ctx2.getBean("obj4", TestBean2.class); // java
		
		TestBean3 t8 = ctx2.getBean("t2", TestBean3.class); // java (setter)
		TestBean3 t9 = ctx2.getBean("t3", TestBean3.class); // java
		
		System.out.println("t8: " + t8);
		
		ctx1.close();
		ctx2.close();
	}
}
