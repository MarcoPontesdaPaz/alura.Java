
public class SistemaInterno {

	private int senha = 2222;

	public void autenticar (Autenticavel g) {

		//System.out.println("SistemaInterno.autenticar()");
		
		if (g.autentica(this.senha)) {
			
			System.out.println("Acesso autorizado !");
		} else {
			
			System.out.println("Acesso negado !");
		}
	}
}
