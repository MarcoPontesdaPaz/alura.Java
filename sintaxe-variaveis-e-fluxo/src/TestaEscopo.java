
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		int idade = 18;
		int quantidadePessoas = 3;
		//boolean estaAcompanhado = true;
		boolean estaAcompanhado = quantidadePessoas >= 2;

		boolean teste = false;
		System.out.println("teste == " + teste);

		System.out.println("valor de acompanhado == " + estaAcompanhado);
		
		// && and
		// || or
		if (idade >= 18 && estaAcompanhado) {
			System.out.println("Você pode entrar !");
		}  
		else {
			System.out.println("Infelizmente vc não pode entrar");
		}
	}	
}
