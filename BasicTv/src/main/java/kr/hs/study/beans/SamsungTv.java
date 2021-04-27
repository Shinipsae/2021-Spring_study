package kr.hs.study.beans;

public class SamsungTv implements Tv {
	
	private int volume;
	private boolean power;
	
	public SamsungTv(int volume, boolean power) {
		// System.out.println("SamsungTv의 생성자");
	}
	
	@Override
	public void volumeUp() {
		if (volume < 100) {
			volume++;
		} else {
			System.out.println("볼륨을 100 초과로 설정할 수 없습니다. \n");
		}
		System.out.println("SamsungTv의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	@Override
	public void volumeDown() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("볼륨을 0 미만으로 설정할 수 없습니다. \n");
		}
		System.out.println("SamsungTv의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	@Override
	public void volumeUp(int vol) {
		if (volume + vol <= 100) {
			volume += vol;
		} else {
			System.out.println("볼륨을 100 초과로 설정할 수 없습니다. \n");
		}
		System.out.println("SamsungTv의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	@Override
	public void volumeDown(int vol) {
		if (volume - vol >= 0) {
			volume -= vol;
		} else {
			System.out.println("볼륨을 0 미만으로 설정할 수 없습니다. \n");
		}
		System.out.println("SamsungTv의 현재 볼륨 크기는 " + volume + "입니다. \n");
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
			System.out.println(power);
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
		String result = "현재 SamsungTv의 전원은 "+ state + "져있고, 볼륨은 " + volume + "입니다. \n";
		return result;
	}

}
