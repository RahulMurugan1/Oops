package com.oops1;

public class Car extends Vehicle {
	String model ;
	String brand ;
	public int taxAmount () {
   return (price*taxPercentage/100);
	}
}
