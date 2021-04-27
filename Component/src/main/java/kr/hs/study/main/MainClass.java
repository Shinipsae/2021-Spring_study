package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.beans.TestBean6;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 test1 = ctx1.getBean("test",TestBean1.class);
		System.out.println(test1);
		
		TestBean2 test3 = ctx1.getBean(TestBean2.class); // 클래스 이름이 같기 때문에 이름을 안줘도 됨
		System.out.println(test3);
		
		TestBean3 test5 = ctx1.getBean(TestBean3.class); // 두 주소값이 다름 (prototype)
		System.out.println(test5);
		
		TestBean3 test7 = ctx1.getBean(TestBean3.class);
		System.out.println(test7);
		
		TestBean4 test8 = ctx1.getBean(TestBean4.class);
		System.out.println(test8);
		System.out.print("init 메소드: ");
		test8.init();
		System.out.print("destroy 메소드: ");
		test8.destroy();
		
		TestBean5 test9 = ctx1.getBean(TestBean5.class);
		System.out.println(test9.getData1());
		System.out.println(test9.getData2());
		System.out.println(test9.getData4());
		System.out.println(test9.getData5());
		
		TestBean6 test10 = ctx1.getBean(TestBean6.class);
		System.out.println(test10.getA());
		System.out.println(test10.getB());
		System.out.println(test10.getC());
		System.out.println(test10.getD());
		
		System.out.println("-------------------------------------------------------------------------");
			
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean1 test2 = ctx2.getBean("test", TestBean1.class);
		System.out.println(test2);
		
		TestBean2 test4 = ctx2.getBean(TestBean2.class);
		System.out.println(test4);
		
		TestBean3 test6 = ctx2.getBean(TestBean3.class);
		System.out.println(test6);
		
		TestBean6 test11 = ctx2.getBean(TestBean6.class);
		System.out.println(test11);
		
		ctx1.close();
		ctx2.close();
		
		
	}

}
