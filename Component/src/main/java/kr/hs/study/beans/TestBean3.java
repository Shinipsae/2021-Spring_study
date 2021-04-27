package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3")
@Lazy
@Scope("prototype")
public class TestBean3 { //type으로 등록한다

	public TestBean3(){
		System.out.println("TestBean3의 생성자");
	}

}
