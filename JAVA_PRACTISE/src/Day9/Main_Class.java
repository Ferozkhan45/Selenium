package Day9;

public class Main_Class {

	public static void main(String[] args) 
	{
	
		Login lg = new Login ();
		{
			lg.username = "Mohammdferozk.vc";
			lg.password = 124312;
			
			System.out.println(lg.username);
			System.out.println(lg.password);
		}
		
		
		Student stud1 = new Student ();
		stud1.sname = "Feroz";
		stud1.sid = 123;
		stud1.grade = 'A';
		stud1.dispay();
		
		
		

	}

}
