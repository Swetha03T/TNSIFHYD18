package com.src.constructor;

public class Car2main {
	public static void main(String[] args) {
		Car2parameterized c2 = new Car2parameterized("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}

}


