package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean6;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public TestBean1 test() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public DataBean4 c() {
		DataBean4 d1 = new DataBean4();
		return d1;
	}
	
	@Bean
	public DataBean5 d() {
		DataBean5 d1 = new DataBean5();
		return d1;
	}
	
	@Bean
	public TestBean6 test1() {
		TestBean6 t1 = new TestBean6();
		t1.setA(200);
		t1.setB(55.55);
		t1.setC(new DataBean4());
		t1.setD(new DataBean5());
		return t1;
	}
}
