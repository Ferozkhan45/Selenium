package day6;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) 
	{
	
		int a[] = {200,100,500,400,800,700};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		

	}

}
