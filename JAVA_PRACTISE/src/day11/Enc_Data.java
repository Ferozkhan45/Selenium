package day11;

public class Enc_Data {

	public static void main(String[] args) 
	{
	
		Encapsulation en = new Encapsulation();
		
		en.setAccno(123451);
		en.setName("Feroz");
		en.setAmount(10000.10);
		
		System.out.println(en.getAccno());
		System.out.println(en.getName());
		System.out.println(en.getAmount());

	}

}
