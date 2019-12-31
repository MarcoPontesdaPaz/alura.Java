
public class TesteTributaveis {

	public static void main(String[] args) {

		// Conta corrente
		ContaCorrente cc = new ContaCorrente (222, 333);
		cc.depositar(100.0);

		// Seguro de vida
		SeguroDeVida sv = new SeguroDeVida ();
		
		// Calculador
		CalculadorDeImposto ci = new CalculadorDeImposto();
		
		
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}
}
