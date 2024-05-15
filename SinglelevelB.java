package com.si.sample;

public class SinglelevelB extends SinglelevelA {

public void print() {
		
		System.out.println("I am a method from class B");
	}
	
	public static void main(String[] args) {
		
		SinglelevelB obj = new SinglelevelB();
		obj.display();
		obj.print();
		
	}

}
