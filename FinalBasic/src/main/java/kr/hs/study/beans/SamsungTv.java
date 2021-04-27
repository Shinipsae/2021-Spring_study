package kr.hs.study.beans;

public class SamsungTv implements Tv {
	
	private int price;
	private boolean power;
	private SonySpeaker speaker;
	
	public SamsungTv() {
		// System.out.println("SamsungTv의 기본생성자");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		if (power == false) {
			power = true;
			System.out.println("SamsungTv의 전원이 켜졌습니다. \n");
		} else {
			System.out.println("SamsungTv의 전원이 이미 켜져있습니다. \n");
		}

	}

	@Override
	public void powerOff() {
		if (power == true) {
			power = false;
			System.out.println("SamsungTv의 전원이 꺼졌습니다. \n");
		} else {
			System.out.println("SamsungTv의 전원이 이미 꺼져있습니다. \n");
		}
	}
	
	@Override
	public String toString() {
		String state = "꺼";
		if (power == true) {
			state = "켜";
		} 
		String result = "현재 SamsungTv의 전원은 "+ state + "져있습니다. 볼륨크기는 " + speaker.getVolume() + "이고, 가격은 " + price + "원 입니다. \n";
		return result;
	}

}
