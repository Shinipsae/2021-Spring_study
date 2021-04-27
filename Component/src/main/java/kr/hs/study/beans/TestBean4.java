package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TestBean4 { //type으로 등록한다

	public TestBean4(){
		System.out.println("TestBean4의 생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean4의 init 메소드");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean4의 destroy 메소드");
	}

}
