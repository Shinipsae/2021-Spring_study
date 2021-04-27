package kr.hs.study.beans;

public class AppleSpeaker implements Speaker {
	
	private int volume;
	
	public AppleSpeaker() {}
	
	public AppleSpeaker(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void volumeUp() {
		if (volume < 100) {
			volume++;
		} else {
			System.out.println("볼륨을 100 초과로 설정할 수 없습니다. \n");
		}
		System.out.println("AppleSpeaker의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	public void volumeDown() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("볼륨을 0 미만으로 설정할 수 없습니다. \n");
		}
		System.out.println("AppleSpeaker의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	public void volumeUp(int vol) {
		if (volume + vol <= 100) {
			volume += vol;
		} else {
			System.out.println("볼륨을 100 초과로 설정할 수 없습니다. \n");
		}
		System.out.println("AppleSpeaker의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

	public void volumeDown(int vol) {
		if (volume - vol >= 0) {
			volume -= vol;
		} else {
			System.out.println("볼륨을 0 미만으로 설정할 수 없습니다. \n");
		}
		System.out.println("AppleSpeaker의 현재 볼륨 크기는 " + volume + "입니다. \n");
	}

}
