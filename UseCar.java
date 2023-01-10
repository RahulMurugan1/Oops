package com.oops1;

public class UseCar {
	public static void main(String[] args) {
		Car car  = new Car () ;
		car.price = 1500000 ;
		car.model = "Swift" ;
		car.taxPercentage = 10 ;
		System.out.println(car.taxAmount() +" " +car.brand +" "+car.model);
	
	Vehicle v = new Vehicle ();
	//v.model = "Audi" ;
}
}