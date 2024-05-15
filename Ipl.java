package com.si.sample;//Approach1

public class Ipl {
	String batsman="viratkohli";
	static String bowler ="Momhed shami";
	void display() {
		System.out.println("Hi");
	
	}
	static String display1() 
	
		{
		return "Hello";
		
	}
		
   public static void main(String[] args) {
	 Ipl i1 =new Ipl();
	 System.out.println(i1.batsman);
	 i1.display1 ();
	 System.out.println(Ipl.bowler);
	 Ipl.display1();
	 
	 }

}
