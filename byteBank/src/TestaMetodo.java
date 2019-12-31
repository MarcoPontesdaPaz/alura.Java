
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		
		contaCorrente.depositar(100);
		//System.out.println(contaCorrente.saldo);
		
		if (! contaCorrente.sacar(20)) {

			//System.out.println("Saldo não realizado. Saldo atual == " + contaCorrente.saldo);

		} else {

			//System.out.println("Saldo realizdo com sucesso. Saldo atual == " + contaCorrente.saldo);

		}
		
		Conta contaCedente = new Conta ();
		contaCedente.depositar(10000);
		
		if (! contaCedente.transferir(contaCorrente, 1000)) {
			System.out.println("Transferência não realizada. Saldo atual == " + contaCedente.saldo);
		} else {
			System.out.println("Transferência realizada com sucesso. Saldo atual == " + contaCedente.saldo);
		}
	}
}
