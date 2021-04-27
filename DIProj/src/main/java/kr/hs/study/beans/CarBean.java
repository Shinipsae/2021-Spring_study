package kr.hs.study.beans;

public class CarBean {
	private int price; // 차 가격
	private String name; // 차종
	
	public CarBean() {
		System.out.println("CarBean의 기본생성자");
	}
	
	public CarBean(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
