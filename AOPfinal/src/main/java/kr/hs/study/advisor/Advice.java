package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void before() {
		System.out.println("before 메소드 호출");
	}
	
	public void after() {
		System.out.println("after 메소드 호출");
	}
	
	public void around() {
		System.out.println("around 메소드 호출");
	}
	
	public int around(ProceedingJoinPoint pjp) throws Throwable{  // around에만 반환형이 있음
		System.out.println("around 메소드 호출전");
		int a = (Integer)pjp.proceed();
		pjp.proceed(); // 실제 메소드(비즈니스 로직) 호출
		System.out.println("around 메소드 호출후");
		return a;
	}
	
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing 메소드 호출");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning 메소드 호출");
	}
}
