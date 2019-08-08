package com.aifa.car;

public class WaterCar extends SuperCar{

	public WaterCar(Icar car) {
		super(car);
	}
	
    public void swim() {
    	System.out.println("Ë®ÀïÓÎ");
    }
    
    @Override
    public void move() {
		super.move();
		swim();
	}
	
}
