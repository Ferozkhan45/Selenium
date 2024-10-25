package day4;

public class WhileLoop_Demo {

	public static void main(String[] args) {

		/*
		 * int i = 0; // Initilization while (i <= 10) // Condition {
		 * System.out.println(i); i =i+3; // Incremaental
		 * 
		 * }
		 */

		/*int i =1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}*/
		
		int i = 1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i + " : odd");
			}
			else
			{
				System.out.println(i + " : even");
			}
			
			i++;
		}
		
		
		
		
		
		
		
		
	}

}
