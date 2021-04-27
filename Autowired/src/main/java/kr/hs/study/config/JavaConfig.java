package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class JavaConfig {
	
	@Bean
	public DataBean1 db1() {
		DataBean1 d1 = new DataBean1();
		return d1;
	}
	
//	@Bean(name="obj1")
	@Bean
	public TestBean1 obj() { // 메소드명 == id
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 obj2() { // 메소드명 == id
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 obj4() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(11);
		t1.setData2(11.11);
	//	t1.setData3(new DataBean1());
		t1.setData4(new DataBean1());
		return t1;
	}
	
	@Bean
	public TestBean1 obj6() {
		TestBean1 t1 = new TestBean1(new DataBean1(), new DataBean1());
		return t1;
	}
}
