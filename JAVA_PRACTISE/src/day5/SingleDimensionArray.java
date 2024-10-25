package day5;

public class SingleDimensionArray {

	public static void main(String[] args) 
	{
	
		int a[] = new int [5];
			a[0]= 100;
			a[1]= 200;
			a[2]=300;
			a[3]=400;
			a[4]=500;
			//a[5]=600;
			
			//System.out.println(a[0]);
			
			
			int b[]= {300,400,500,600,700};
			//System.out.println(b.length);
			
				for(int i=0; i<b.length; i++)
				System.out.println(b[i]);
			
		/*	for(int x:b) //Enhanced loop
			{
				System.out.print(x);
								
			}*/
			
	}

}
