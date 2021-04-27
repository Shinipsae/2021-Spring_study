package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean2 { //type으로 등록한다

	public TestBean2(){
		System.out.println("TestBean2의 생성자");
	}

}
