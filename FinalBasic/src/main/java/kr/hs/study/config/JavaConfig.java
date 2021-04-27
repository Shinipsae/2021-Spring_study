package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	@Bean
	public SamsungTv samsungTv(){
		SamsungTv s1 = new SamsungTv();
		s1.setPrice(2000000);
		s1.setPower(false);
		s1.setSpeaker(new SonySpeaker(20));
		return s1;
	}
	
	@Bean
	public LgTv lgTv(){
		return new LgTv(3000000, false, new AppleSpeaker(90));
	}
	
	@Bean
	public SonySpeaker sonySpeaker() {
		SonySpeaker s1 = new SonySpeaker(0);
		return s1;
	}
	
	@Bean
	public AppleSpeaker appleSpeaker() {
		AppleSpeaker a1 = new AppleSpeaker(0);
		return a1;
	}
}
