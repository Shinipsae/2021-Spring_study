package kr.hs.study.beans;

public class CarUserBean {
	private String owner;
	private String color;
	private CarBean car_type;
	
	public CarUserBean() {
		System.out.println("CarUserBean의 기본 생성자");
	}
	
	public CarUserBean(String owner, String color, CarBean car_type) {
		this.owner = owner;
		this.color = color;
		this.car_type = car_type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public CarBean getCar_type() {
		return car_type;
	}

	public void setCar_type(CarBean car_type) {
		this.car_type = car_type;
	}
	public void printData() {
		System.out.println("차주: " + getOwner());
		System.out.println("차 색깔: " + getColor());
		System.out.println("차종: " + car_type.getName());
		System.out.println("차 가격: " + car_type.getPrice());
		System.out.println("------------------------------------");
	}
	

}
