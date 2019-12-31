
public class CalculadorDeImposto {

	private double totalImposto = 0;

	public double getTotalImposto() {
		return totalImposto;
	}

	public void registra (Tributavel t) {
	
		totalImposto = totalImposto + 
					   t.getValorImposto();
	}
}
