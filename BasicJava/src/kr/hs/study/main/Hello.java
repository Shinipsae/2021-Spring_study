package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class Hello {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorldEn(); // 부모가 자식객체 참조가능
		hello.sayHello();
		HelloWorld hello2 = new HelloWorldKo();
		hello2.sayHello();

	}

}
