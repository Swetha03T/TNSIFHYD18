package com.si.sample;//Approach 2


public class Normal {
	String batsman = "viratkohli";
	static String bowler = "Momhed shami";
	void display()
	{
		System.out.println("hi");
		
	}
	static String display1 () 
	{
		return "Hello";
		
	}
}

	class Access
	{
      public static void main(String arg[])
      {
    	  Normal  N1=new Normal();
    	  System.out.println(N1.batsman);
    	  N1.display();
    	  System.out.println(Normal.bowler);
    	  Normal.display1();
    			  
      }
      
 
		
	}