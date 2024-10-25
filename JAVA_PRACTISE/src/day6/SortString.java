package day6;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) 
	{
	
		
		String a[] = {"A","c","d","f","b","e",};
		
			//	for(String l:a)
				{
					System.out.println("Before Sorting");
					System.out.println(Arrays.toString(a));
				}
				
				Arrays.sort(a);
				{	
					System.out.println("After Sorting");
					System.out.println(Arrays.toString(a));
				}
				

	}

}
