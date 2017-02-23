package com.dannycode;

public class PoundsToOuncesConversion {
	double pounds;
	double ounces;
	
	public PoundsToOuncesConversion(double pounds){
		this.pounds = pounds;
		this.ounces = this.pounds*16;
	}
	
	public double conversion(){
		return ounces;
	}
}
