package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Tv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.LgTv;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// 초기값: 전원꺼져있음, 볼륨 : 0
		Tv samsungTv = ctx.getBean("samsungTv", SamsungTv.class);
		Tv lgTv = ctx.getBean("lgTv", LgTv.class);
		// 부모클래스 객체이름(아무거나) = ctx.getBean("id값", 자식클래스.class);
		
		System.out.println(samsungTv.toString());
		System.out.println(lgTv.toString());
		
		samsungTv.powerOn(); // 전원 켜기
		samsungTv.volumeUp(50); // 볼륨 50 올리기
		samsungTv.volumeUp(60); // 볼륨을 100 초과로 높여보기
		System.out.println(samsungTv.toString());
		
		lgTv.powerOff(); // 꺼져있는 전원 꺼보기
		lgTv.volumeUp(); // 볼륨 1 올리기		
		lgTv.volumeDown(5); // 볼륨을 0 미만으로 낮춰보기
		System.out.println(lgTv.toString());

		ctx.close();
		
	}

}
