package day12;

public class Static {

	static String s = "Welcome";
	int empid;
	static	int depno = 20;
	String name;

	void display()
	{
		System.out.println(empid+ " " + " "+ depno+ " " + name );
	}
	
	
	

	public static void main(String[] args) 
	{

		Static s = new Static();
		s.empid = 100;
		s.name = "Feroz";
		depno = 30;

		s.display();





	}

}
