package com.aifa.car;

public class Test {

	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		
        System.out.println("���ӷ��й���========");
        
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();
        
        System.out.println("������ˮ����========");
        
        WaterCar waterCar =new WaterCar(flyCar);
        waterCar.move();
	}

}
