
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Idade é maior ou igual a 18 anos");
		} 
		else if (quantidadePessoas >= 2) {
			System.out.println("Você não tem 18, mas pode entrar, pq está acompanhando.");
		} 
		else {
			System.out.println("Idade é menor que 18");
			System.out.println("Infelizmente vc não pode entrar");
		}
	}
}
