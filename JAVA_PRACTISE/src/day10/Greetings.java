package day10;

public class Greetings 

{

    //No Params No return value
	
	void m1()
	{
		System.out.println("Hello");
	}
     
	// No Params but it will some return value 
	
	String m2()
	{
		return"Hello how are you";
	}
	
	// Takes Params but it will not return value 
	
	 void m3(String name)
	{
		System.out.println("Hello "+ name);
	}
	
	// Takes Params  and also returns value
	 
	 String m4(String name)
	 {
		 return("Hello " +name);
	 }
}
	

