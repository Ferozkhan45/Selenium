package day6;

public class SearchingElementinArray {

	public static void main(String[] args) {

		int a[] = { 100, 200, 400, 500, 300, 500, 100, 900, 100, 200 };
		int se = 100;
		boolean status = false;

		/*
		 * { for (int i = 0; i < a.length; i++)
		 * 
		 * if (a[i] == se)
		 * 
		 * { System.out.println("Element found"); status = true; break;
		 * 
		 * } }
		 */

		for (int x : a) {
			if (se == x) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}

		if (!status) {
			System.out.println("Element not found");
		}

	}

}
