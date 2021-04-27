package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean5 { //type으로 등록한다
	private int data1;
	private String data2;
	
	@Autowired // DataBean4 클래스의 빈(객체)가 있으면 그 주소값을 data4에 주입시켜라
	private DataBean4 data4;
	@Autowired // DataBean5 클래스의 빈(객체)가 있으면 그 주소값을 data5에 주입시켜라
	private DataBean5 data5;
	
	public TestBean5() {
		System.out.println("TestBean5의 생성자");
	}

	// 1. 멤버변수에 자동주입 data4, data5 (setter가 없어도 됨)
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public DataBean5 getData5() {
		return data5;
	}

}
