package skr.wtf.learn.springlifecycle.service;

import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean {

	public void initMethod(){
		System.out.println("Car#initMethod");
	}
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car() {
	}

	public Car(String brand) {
		this.brand = brand;
	}
	public void tell(){
		System.out.println("my brand is "+brand);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Car#afterPropertiesSet");
	}
}
