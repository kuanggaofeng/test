package com.aifa.car;

public class FlyCar extends SuperCar{
	
	public FlyCar(Icar car) {
		super(car);
	}
	
    public void fly() {
    	System.out.println("天上飞的车");
    }
    
    @Override
    public void move() {
		super.move();
		fly();
	}
}
