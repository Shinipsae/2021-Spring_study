package kr.hs.study.beans;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	public void print() {
		System.out.println("TestBean2의 출력메소드");
	}
	
	public void init() {
		System.out.println("생성자 호출 다음에 실행되는 init 메소드");
	}
	
	public void destroy() {
		System.out.println("ctx.close() 전에 실행되는 destroy 메소드");
	}
	
	
}
