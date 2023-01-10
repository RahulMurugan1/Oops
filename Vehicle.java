package com.oops1;

public class Vehicle {
	int price  ;
	int taxPercentage  ;
	public int findNetPrice() {
		return price+(price *taxPercentage/100);
		
		
	}
	
	

}
