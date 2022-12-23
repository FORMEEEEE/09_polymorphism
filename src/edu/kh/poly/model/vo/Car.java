package edu.kh.poly.model.vo;

public class Car {

	private String engine;
	private String fuel;
	private int wheel;
	
	public Car() { // 기본생성자
		super(); //부모생성자(object)
		// super는 안적으면 컴파일러가 알아서 만들어줌
	}
	//매개변수 생성자
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	// object.toString() 오버라이딩
	@Override // 오버라이드 했다는걸 알려주는 override 어노테이션 작성
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
	
	
	
}
