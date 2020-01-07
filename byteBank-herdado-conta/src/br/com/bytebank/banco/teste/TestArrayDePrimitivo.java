package br.com.bytebank.banco.teste;

public class TestArrayDePrimitivo {

	public static void main(String[] args) {

		int idades[] = new int[5];
		
		
		for (int i = 0; i < idades.length; i++) {
			
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			
			System.out.println(idades[i]);
		}		
		
		
		
//		idades[0] = 33;
//		
//		try
//		{
//			idades[4] = 8;
//			int idade = idades[4];
//			
//			System.out.println(idades.length);
//			
//			System.out.println(idade);
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Error == " + e.getClass() + " - " + e.toString());
//		}
		
		
				
				
		
		
		
//		idade = idades[1] = 2;
//		System.out.println(idade);
//		idade = idades[2] = 3;
//		System.out.println(idade);
//		idade = idades[3] = 4;
//		System.out.println(idade);
//		idade = idades[4] = 5;
//		System.out.println(idade);
	}
}
