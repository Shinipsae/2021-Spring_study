package kr.hs.study.beans;

public class HelloWorldEn implements Hello {
	
	public HelloWorldEn() {
		System.out.println("HelloBean의 생성자");
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello Spring~");
	}

}
