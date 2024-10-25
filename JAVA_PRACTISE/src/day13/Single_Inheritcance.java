package day13;


   class A
   {
	   int a = 100;
	   void display()
	   {
		   System.out.println(a);
	   }
   }
 
   class B 	extends A
   {
	   int b=200;
	   void show()
	   {
		   System.out.println(b);
	   }
	   
   }

public class Single_Inheritcance {

	public static void main(String[] args) 
	{
	
		B objb = new B();
		objb.display();
		objb.show();
		
		
		
		

	}

}
