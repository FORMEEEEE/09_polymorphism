package edu.kh.poly.model.vo;

public class Tesla extends Car{
	// car를 상속받을수 있도록 해야함
	
	private int batteryCapacity;
	// 기본생성자 만들기 ctrl + space
	public Tesla() {
		super(); //car
	}
	// alt shift s > o > 드롭박스 > 매개변수클릭 상속받았을때 사용
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	// car.toString 오버라이딩
	@Override
	public  String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
}
