package com.aifa.car;

public class Test {

	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		
        System.out.println("增加飞行功能========");
        
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();
        
        System.out.println("增加游水功能========");
        
        WaterCar waterCar =new WaterCar(flyCar);
        waterCar.move();
	}

}
