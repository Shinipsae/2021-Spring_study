package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
public class JavaConfig {
	/* <bean id="java1" class="kr.hs.study.TestBean1"> */
	@Bean
	public TestBean2 obj2() { // 메소드명 == id
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	@Bean(name="obj3")
	@Lazy
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("prototype")
	public TestBean2 obj4() {
		TestBean2 t3 = new TestBean2();
		return t3;
	}
	
	@Bean
	public TestBean3 t2() {
		TestBean3 t2 = new TestBean3(20, "Spring2", new DataBean3());
		return t2;
	}
	
	@Bean
	public TestBean3 t3() {
		TestBean3 t3 = new TestBean3();
		t3.setA(30);
		t3.setB("Spring3");
		t3.setC(new DataBean3());
		return t3;
	}
	
	@Autowired
	public TestBean4 t4() {
		TestBean4 t4 = new TestBean4();
		t4.setData1(40);
		// t4.setData2(new DataBean3());
		return t4;
		}
	
	/* @Autowired
	 * private DataBean4 data; 
	 * -> DataBean4 타입(클래스이름)으로 등록된 Bean을 data4에 주입
	 * (자동으로 setDataa*/
	
	/* @Autowired
	 * public void setData4 DataBean4 data4 {}
	 * 
	 * @Autowired
	 * public TestBean4 DataBean4 data4 {}
	 * */
	
	
	
}
