
public class TestaLacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for ( int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			
			System.out.print("Tabualda de (" + multiplicador + ") == ");
			
			for (int contador = 0; contador <= 10; contador ++) {
	
				System.out.print(" " + multiplicador * contador);
			}
			
			System.out.println("");
		}
	}
}
