
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Idade � maior ou igual a 18 anos");
		} 
		else if (quantidadePessoas >= 2) {
			System.out.println("Voc� n�o tem 18, mas pode entrar, pq est� acompanhando.");
		} 
		else {
			System.out.println("Idade � menor que 18");
			System.out.println("Infelizmente vc n�o pode entrar");
		}
	}
}
