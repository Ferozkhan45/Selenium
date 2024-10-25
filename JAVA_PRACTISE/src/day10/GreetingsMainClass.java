package day10;

public class GreetingsMainClass {

	public static void main(String[] args) 
	{
		
		Greetings gr = new Greetings ();	
		gr.m1();
		
		//String wishes =	gr.m2();
		System.out.println(gr.m2());
		
		gr.m3("Feroz");
		
		System.out.println(gr.m4("Khan"));
		
	}

}
