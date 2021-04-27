package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarBean;
import kr.hs.study.beans.CarUserBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarBean car1 = ctx1.getBean(CarBean.class);
		CarUserBean caruser1 = ctx1.getBean(CarUserBean.class);
		
		car1.setName("Sonata");
		car1.setPrice(3000);
		
		caruser1.setOwner("kim");
		caruser1.setColor("red");
		
		System.out.println("차주: " + caruser1.getOwner());
		System.out.println("차이름: " + caruser1.getCar_type().getName());
		System.out.println("차색깔: " + caruser1.getColor());
		System.out.println("차가격: " + caruser1.getCar_type().getPrice());

		ctx1.close();
		
	}

}
