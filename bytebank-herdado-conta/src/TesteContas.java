public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1234, 1);
		cc.depositar(100);

		//ContaPoupanca cp = new ContaPoupanca(1234, 2);
		//cp.depositar(200);

		//cc.transferir(cp,  99.8);
		
		try {

			cc.sacar(201);
			System.out.println("Saque realizado com sucesso. Saldo atual == " + cc.getSaldo());

		} catch (SaldoInsuficienteException ex ) {
			System.out.println(ex.getMessage());
		}
		
		//System.out.println("CP == " + cp.getSaldo());
	}
}
