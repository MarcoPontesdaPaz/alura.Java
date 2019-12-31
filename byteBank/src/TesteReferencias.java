
public class TesteReferencias {
	
	public static void main (String[] args ) {
		
		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 300;		
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		primeiraConta.saldo = 500;
		
		System.out.println(segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("sao iguais");
		} else {
			System.out.println("sao diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
