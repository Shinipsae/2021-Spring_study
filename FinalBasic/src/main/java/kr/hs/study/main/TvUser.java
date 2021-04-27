package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;
import kr.hs.study.config.JavaConfig;

public class TvUser {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// 초기값: 전원꺼져있음, 가격 : 0, 볼륨 : 0
		SamsungTv samsungTv1 = ctx1.getBean("samsungTv", SamsungTv.class);
		LgTv lgTv1 = ctx1.getBean("lgTv", LgTv.class);
		
		SonySpeaker sonySpeaker1 = ctx1.getBean("sonySpeaker", SonySpeaker.class);
		sonySpeaker1.setVolume(50);
		
		AppleSpeaker appleSpeaker1 = ctx1.getBean("appleSpeaker", AppleSpeaker.class);
		appleSpeaker1.setVolume(30);
		
		samsungTv1.setPower(true);
		samsungTv1.setPrice(1000000);
		samsungTv1.setSpeaker(sonySpeaker1);

		lgTv1.setPower(false);
		lgTv1.setPrice(1500000);
		lgTv1.setSpeaker(appleSpeaker1);

		System.out.println(samsungTv1.toString());
		System.out.println(lgTv1.toString());
		
		sonySpeaker1.volumeUp(60);
		appleSpeaker1.volumeDown(40);
		
		System.out.println(samsungTv1.toString());
		System.out.println(lgTv1.toString());
		
		
		System.out.println("---------------------------------------------------------");

		SamsungTv samsungTv2 = ctx2.getBean("samsungTv", SamsungTv.class);
		LgTv lgTv2 = ctx2.getBean("lgTv", LgTv.class);
		
		SonySpeaker sonySpeaker2 = ctx2.getBean("sonySpeaker", SonySpeaker.class);
		AppleSpeaker appleSpeaker2 = ctx2.getBean("appleSpeaker", AppleSpeaker.class);
		
		samsungTv2.setSpeaker(sonySpeaker2);
		lgTv2.setSpeaker(appleSpeaker2);
		
		System.out.println(samsungTv2.toString());
		System.out.println(lgTv2.toString());
		
		sonySpeaker2.setVolume(10);
		appleSpeaker2.setVolume(20);
		sonySpeaker2.volumeUp();
		appleSpeaker2.volumeDown();
		
		samsungTv2.powerOff();
		lgTv2.powerOn();
		
		System.out.println(samsungTv2.toString());
		System.out.println(lgTv2.toString());
		
		ctx1.close();
		ctx2.close();
		
	}

}
