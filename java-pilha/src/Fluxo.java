public class Fluxo {

	public static void main(String[] args) throws MinhaException {	
		System.out.println("Ini do m�todo main");
		
		try {
			metodo1 ();
		}
		catch (Exception	ex) { 
			System.out.println(ex.toString() + " " + ex.getMessage());
			//ex.printStackTrace();		
		} 
		System.out.println("Fim do m�todo main");
	}
	
	public static void metodo1() throws MinhaException {
		System.out.println("Ini do m�todo 1 +");
		metodo2_1 ();
		System.out.println("Fim do m�todo 1 -");
	}
	
	public static void metodo2_1() throws MinhaException {
		System.out.println("Ini do m�todo 2 +");
		//throw new MinhaException("MinhaException");
		System.out.println("Fim do m�todo 2 -");
	}	
}
