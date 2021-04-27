package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hello h1 = ctx.getBean("helloKo", HelloWorldKo.class);
		Hello h2 = ctx.getBean("helloEn", HelloWorldEn.class);
		// 부모클래스 객체이름(아무거나) = ctx.getBean("id값", 자식클래스.class);
		h1.sayHello();
		h2.sayHello();
		
		System.out.println(h1);
		
		// 주소값이 다 같은 것으로 보아 계속 새로운 것을 가져오는게 아니라 
		// 한번 갖고온 객체를 요청할 때마다 사용함 -> 싱글톤(singleton)패턴
		// 객체는 한번 가져오면 계속 사용된다. 새로 생성되지 않는다.
		
		ctx.close();
		
	}

}
