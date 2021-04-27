package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUserBean;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarUserBean obj1 = ctx.getBean("u1", CarUserBean.class);
		CarUserBean obj2 = ctx.getBean("u2", CarUserBean.class);
		CarUserBean obj3 = ctx.getBean("u3", CarUserBean.class);
		
		obj1.printData();
		obj2.printData();
		obj3.printData();

		ctx.close();

	}
}
