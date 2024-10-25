package day13;

class C {
	int a = 100;

	void display() 
	{
		System.out.println(a);
	}
}

class D extends C {
	int b = 200;

	void show() {
		System.out.println(b);
	}
}
	class E extends D {
		int c = 300;

		void print() {
			System.out.println(c);
		}
	}



public class MultiLeve {

	public static void main(String[] args) 
	{

		E obje = new E();
		obje.print();
		obje.show();
		obje.display();
		





	}

}
