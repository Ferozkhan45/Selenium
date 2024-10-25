package day8;

public class ReverseString {

	public static void main(String[] args) 
	{

		/*String s = "Welcome"; // Approach 1
		  String r = "";
		
		//System.out.println(s.length());
		
		for(int i = s.length()-1; i>=0; i--)
		{
			r = r+s.charAt(i);
			
		}
		System.out.println(r);*/
		
		
		/*String s = "welcome";   // Approach 2 By converting string to char array type
		String r = "";
		
		char a[] = s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			r=r+a[i];
		}
			
		System.out.println(r);*/
		
		StringBuffer s = new StringBuffer("King");
		//StringBuilder s = new StringBuilder("Hello");
		System.out.println(s.reverse());
			
			
	}

}
