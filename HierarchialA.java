package com.si.sample;

public class HierarchialA {
	public void display() {
		System.out.println("I am method from class A");
	}

}

 class HierarchialB extends HierarchialA {
	public void print() {
		System.out.println("I am a method from class B");
	}

}

 class HierarchialC extends HierarchialA {
	public void show() {
		 System.out.println(" I am a method from class C");
	 }

}



