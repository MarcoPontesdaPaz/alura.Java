
public class TestaPontoFlutuante {
	
	public static void main (String[] args) {
		
		double salario = 1250.70;

		System.out.println("meu sal�rio � " + salario);
	
		System.out.printf("meu sal�rio � %.2f\n", salario);
		
		double divisao = 5/2;
		System.out.println("O resultado da divis�o � " + divisao);
		
		int    divisao2 = 5/2;											// inteiros nas parcelas, o resultado � inteiro
		System.out.println("O resultado da divis�o2 � " + divisao2);
		
		double divisao3 = 5/2;											// inteiros nas parcelas, o resultado � double, mas truncado		
		System.out.println("O resultado da divis�o3 � " + divisao3);
		
		double divisao4 = (double)5/2;										// inteiros nas parcelas, o resultado � double, pq houve Cast		
		System.out.println("O resultado da divis�o4 � " + divisao4);		
	}
}
