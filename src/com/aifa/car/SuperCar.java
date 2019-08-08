package com.aifa.car;

public class SuperCar implements Icar {
    protected Icar car;
	public SuperCar(Icar car) {
		super();
		this.car=car;
	}

	@Override
	public void move() {
		car.move();
	}
}
