package kr.hs.study.beans;

public class HelloWorldKo implements Hello {
	
	public HelloWorldKo() {
		System.out.println("HelloBean의 생성자");
	}
	
	@Override
	public void sayHello() {
		System.out.println("스프링아 안녕~");
	}

}
