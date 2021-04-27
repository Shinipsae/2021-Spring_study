package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Bean
	@Autowired
	public TestBean1 obj2() {
		TestBean1 t1 = new TestBean1(new DataBean1(), new DataBean1());
		return t1;
	}
	
}
 