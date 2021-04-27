package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarUserBean {
	private String owner;
	private String color;
	private CarBean car_type;
	
	@Autowired
	public CarUserBean(CarBean car_type) {
		this.car_type = car_type;
	}
	
	// @Autowired
	public CarUserBean(@Value("kim")String owner, @Value("red")String color, CarBean car_type) {
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

	@Override
	public String toString() {
		return "CarUserBean [owner=" + owner + ", color=" + color + ", car_type=" + car_type + "]";
	}
	
}
