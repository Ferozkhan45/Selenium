package day10;

public class Student 
{

	int sid;
	String sname;
	char grad;
	
	void printStudentDate()
	{
			System.out.println(sid+ " "+sname+" "+grad);
	}
	
	void setstudentdata(int id, String name, char gr)
	{
		sid = id;
		sname = name;
		grad = gr;
	}
	
	Student(int id, String name, char gr) // Constructor
	{
		sid = id;
		sname = name;
		grad = gr;
	}
	
	Student()
	{
		String name;
		int id;
		char grades;
	}
	
	
	
}
