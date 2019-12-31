
public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 146;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		
		segundaConta.saldo = 300;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		System.out.println(segundaConta.agencia);
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("sao iguais");
		} else {
			System.out.println("sao diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
