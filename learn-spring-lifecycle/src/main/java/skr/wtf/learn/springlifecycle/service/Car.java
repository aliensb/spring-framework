package skr.wtf.learn.springlifecycle.service;

public class Car {
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
}
