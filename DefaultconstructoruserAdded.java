package com.src.constructor;

public class DefaultconstructoruserAdded {
private String brand;
	
	public DefaultconstructoruserAdded(String ibrand) {
		brand=ibrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public static void main(String[] args) {
		
		DefaultconstructoruserAdded phone = new DefaultconstructoruserAdded("Nokia");
		System.out.println (phone.getBrand ());
	}

}

