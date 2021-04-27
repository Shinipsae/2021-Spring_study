package kr.hs.study.beans;

public interface Speaker {
	public void volumeUp(); // 볼륨 업(1)
	public void volumeDown(); // 볼륨 다운 (1)
	public void volumeUp(int vol); // 볼륨 업 (인자만큼)
	public void volumeDown(int vol); // 볼륨 다운 (인자만큼)
}
