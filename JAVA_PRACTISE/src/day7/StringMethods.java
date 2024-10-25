package day7;

public class StringMethods {

	public static void main(String[] args) {
		
		
		// Length // Trim // chArat // Contains // equals // equalsignorecase // replace
		// Substring //touppercase // tolowercase // Split

		
		/*String s= " Hello ";
		
		System.out.println(s.length());
		System.out.println(s.trim().length());
		System.out.println(s.trim().charAt(1));
		System.out.println(s.contains("ello"));
		System.out.println(s.equals("Hello"));
		System.out.println(s.trim().equalsIgnoreCase("Hello"));
		System.out.println(s.trim().substring(0,3)); // Hell
		System.out.println(s.trim().toLowerCase());
		
		String m = "abc123@gmail.com";
	 String sp[] =	m.split("@");
	 System.out.println(sp[0]);*/
	 
	 
	 String name = "John";
	 
	 System.out.println(name.replace('J', 'j').contains("john"));
	 System.out.println(name.toLowerCase().contains("john"));
	 
		
	}

}
