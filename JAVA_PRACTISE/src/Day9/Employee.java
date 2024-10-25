package Day9;

public class Employee {

	int eid;
	String ename;
	String job;
	int sal;

		void display()
	{
		System.out.println("Employee ID :" +eid);
		System.out.println("Employee Name :" +ename);
		System.out.println("JOB Type :" +job);
		System.out.println("Salary :" +sal);
	}

	public static void main(String[] args) 
	
	{
		Employee emp = new Employee();
		emp.eid = 2927;
		emp.ename = "Feroz khan";
		emp.job = "Automation Testing";
		emp.sal = 1300000;
		emp.display();

		
		Employee emp1 = new Employee();
		emp1.eid = 2827;
		emp1.ename =  "khan";
		emp1.job = "Automation Testing";
		emp1.sal = 1400000;
		emp1.display();
		
	}

		
	
}
