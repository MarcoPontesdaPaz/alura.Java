public class FluxoComTratamento {

	public static void main(String[] args) throws MinhaException {	
		System.out.println("Ini do m�todo main");
		
		try {
			metodo1 ();
		}
		catch (ArithmeticException | 
			  NullPointerException ex) { 
			System.out.println(ex.toString() + " " + ex.getMessage());
			//ex.printStackTrace();			
		} 
		
		System.out.println("Fim do m�todo main");
	}
	
	public static void metodo1() throws MinhaException {
		System.out.println("Ini do m�todo 1");
			metodo2 ();
		System.out.println("Fim do m�todo 1");
	}
	
	public static void metodo2() throws MinhaException {
		System.out.println("Ini do m�todo 2");
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			//int a = i/0;
			
			Conta c = null;
			c.deposita ();
			
		}
		System.out.println("Fim do m�todo 2");
	}	
}
