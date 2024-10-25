package day6;

public class FindNumberOfRepeatations {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 10, 30, 50, 90, 10, 70, 30, 30, 30 };
		int num = 30;
		int count = 0;

		/*
		 * for(int x :a) { if(x==num) count++; } System.out.println(count);
		 */

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				count++;
			
		}

		System.out.println(count);
	}

}
