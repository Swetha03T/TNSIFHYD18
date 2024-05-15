package com.si.sample;

public class Multilevelprogram3 extends Multilevelprogram2 {
    int getLineofCode() {
    	
			return 20;
		}
		
		public static void main(String[] args) {
			Multilevelprogram3 mp3 = new Multilevelprogram3();
			System.out.println("I am "+mp3.getName()+" and I code in " + mp3.getCodinglanguage()+" . This Program has" + mp3.getLineofCode()+" lines");
		}

	}
