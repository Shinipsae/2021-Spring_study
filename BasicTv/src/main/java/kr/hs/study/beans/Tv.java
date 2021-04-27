package kr.hs.study.beans;

public interface Tv {
	public void volumeUp(); // 볼륨 업(1)
	public void volumeDown(); // 볼륨 다운 (1)
	public void volumeUp(int vol); // 볼륨 업 (인자만큼)
	public void volumeDown(int vol); // 볼륨 다운 (인자만큼)
	public void powerOn(); // 전원 켜기
	public void powerOff(); // 전원 끄기
}
