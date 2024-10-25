package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the value for the position " + i + ":");
			a[i] = sc.nextInt();
		}
		System.out.print("The value of array :");
		System.out.println(Arrays.toString(a));

		sc.close();

	}

}
