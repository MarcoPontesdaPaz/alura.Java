
public class TestaValores {
	
	public static void main(String[] args) {
		
		Cliente titular = new Cliente ();
		
		titular.setCpf("123.456.789-00");
		titular.setNome("Marco");
		titular.setProfissao("Analista de sistemas");

		Conta conta = new Conta (100, 1333, titular);
		
		Conta conta2 = new Conta (100, 333, titular);
		
		Conta conta3 = new Conta (100, 444, titular);
		
		System.out.println(Conta.getTotalContas());

	}
}
