
public class TestaPontoFlutuante {
	
	public static void main (String[] args) {
		
		double salario = 1250.70;

		System.out.println("meu salário é " + salario);
	
		System.out.printf("meu salário é %.2f\n", salario);
		
		double divisao = 5/2;
		System.out.println("O resultado da divisão é " + divisao);
		
		int    divisao2 = 5/2;											// inteiros nas parcelas, o resultado é inteiro
		System.out.println("O resultado da divisão2 é " + divisao2);
		
		double divisao3 = 5/2;											// inteiros nas parcelas, o resultado é double, mas truncado		
		System.out.println("O resultado da divisão3 é " + divisao3);
		
		double divisao4 = (double)5/2;										// inteiros nas parcelas, o resultado é double, pq houve Cast		
		System.out.println("O resultado da divisão4 é " + divisao4);		
	}
}
