
public class Designer extends Funcionario{

	public Designer () {
		
	}
	
	public double getBonificacao () {							// sobrescrita - m�todo da classe m�e reescrito
																// mesma assinatura do 	m�todo da classe m�e
		
		System.out.println("Chamando o m�todo de bonifica��o do Designer");		
		
//		return	super.getBonificacao() + 
//				200;											// Reaproveitando o 	m�todo da classe m�e
		
		return	200;		
	}
}
