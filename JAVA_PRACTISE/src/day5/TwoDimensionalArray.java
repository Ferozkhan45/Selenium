package day5;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{

		/*int i [][] = new int [3][2];
		i[0][0]= 100;
		i[0][1]=200;

		i[1][0]= 300;
		i[1][1]=400;

		i[2][0]= 500;
		i[2][1]=600;
	}*/

		{
			int a [][] = {  {100,200},
					{300,400},
					{500,600}};


			//System.out.println("Lenght of rows  " +a.length);
			//System.out.println("Lenght of Columns" +a[0].length);

			//	System.out.println(a[0][0]);

			/*	for(int r=0; r<a.length; r++)
			{
				for(int c=0;c<=1; c++)
				{
					System.out.print(a[r][c] +" ");
				}
				System.out.println();
			}*/


			for(int arr[]:a) //Enhanced Loop [] took as it is multidimensional array
			{
				for(int x:arr)
				{
					System.out.print(x  +" ");
				}
				System.out.println();
			}



		}

	}

}


