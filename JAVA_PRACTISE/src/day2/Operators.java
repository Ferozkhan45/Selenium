package day2;

public class Operators {

	public static void main(String[] args) 
	{
	
		int a = 20, b = 10;
		
		System.out.println(a>b); // true
		System.out.println(a<b); // false
		
		boolean x = true, y = false;
		
		System.out.println(x && y); // false
		System.out.println(x || y); //true
		
		boolean b1 = 10>30;
		boolean b2 = 30>20;
		
		System.out.println(b1); //False 
		System.out.println(b2); // True
		
		System.out.println(b1 && b2); //False
		System.out.println(b1 || b2); //True
		
		System.out.println((10<20) && (30>20) ); //True
		
		

	}

}
