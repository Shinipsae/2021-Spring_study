package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class CarBean {
	private int price;
	private String name;
	
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
