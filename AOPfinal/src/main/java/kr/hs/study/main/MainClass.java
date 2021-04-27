package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJa;
import kr.hs.study.beans.HelloKo;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml"); // xml
		
		Hello helloko = ctx1.getBean("h1", HelloKo.class);
		Hello helloen = ctx1.getBean("h2", HelloEn.class);
		Hello helloja = ctx1.getBean("h3", HelloJa.class);
		
		System.out.println(helloko);
		System.out.println(helloen);
		System.out.println(helloja);
	
		helloja.hello1();
		helloja.hello3();
		helloko.hello1();
		helloen.hello1();
		helloen.hello2();
		helloja.hello2();
		
		ctx1.close();

	}
}
