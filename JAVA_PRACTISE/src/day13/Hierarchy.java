package day13;

class parent
{
	void diplay (int a)
	{
		System.out.println(a);
	}
}

class child1 extends parent
{
	void print (int b)
	{
		System.out.println(b);
	}
}

class child2 extends parent
{
	void show(int c)
	{
		System.out.println(c);
	}
}

public class Hierarchy 
{

	public static void main(String[] args) 
	{
	
		child1 c1 = new child1();
		{
			c1.print(100);
			c1.diplay(200);
		}
		
		child2 c2 = new child2(); 
		    c2.diplay(100);
		    c2.show(300);
			
		
	}
	
	
	
	
	
	
}
