package com.aifa.car;

public class FlyCar extends SuperCar{
	
	public FlyCar(Icar car) {
		super(car);
	}
	
    public void fly() {
    	System.out.println("���Ϸɵĳ�");
    }
    
    @Override
    public void move() {
		super.move();
		fly();
	}
}
