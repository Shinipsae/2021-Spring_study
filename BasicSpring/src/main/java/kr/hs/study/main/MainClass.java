package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =  // 설정파일의 위치에 따라서 달라짐
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
			//	new ClassPathXmlApplicationContext("classpath:config.xml"); // Generic...
		// getBean() 메서드 호출할 때 만들어져있던 객체를 가지고 옴
		TestBean t1 = ctx.getBean(TestBean.class); // 컨테이너에 있는 객체 가지고오기 getBean
		t1.method(); // 클래스로 갖고오는 방법
		
		//TestBean t2 = (TestBean)ctx.getBean("t2");
		//t2.method(); // 객체이름으로 갖고오는 방법
		
		Test t2 = ctx.getBean("t2", TestBean.class); // 가장 많이 씀
		// 부모클래스 객체이름(아무거나) = ctx.getBean("id값", 자식클래스.class);
		System.out.println("t2" + t2);
		
		Test t3 = ctx.getBean("t2", TestBean.class); // TestBean 클래스에 여러개의 객체를 만듦
		System.out.println("t3" + t3);
		// id -> t2, 객체이름: t3
		
		Test t4 = ctx.getBean("t2", TestBean.class); // TestBean 클래스에 여러개의 객체를 만듦
		System.out.println("t3" + t4);
		// id -> t2, 객체이름: t4
		
		// 주소값이 다 같은 것으로 보아 계속 새로운 것을 가져오는게 아니라 
		// 한번 갖고온 객체를 요청할 때마다 사용함 -> 싱글톤(singleton)패턴
		// 객체는 한번 가져오면 계속 사용된다. 새로 생성되지 않는다.
		
		ctx.close();
		
	}

}
