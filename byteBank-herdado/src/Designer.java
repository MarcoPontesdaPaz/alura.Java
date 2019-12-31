
public class Designer extends Funcionario{

	public Designer () {
		
	}
	
	public double getBonificacao () {							// sobrescrita - método da classe mãe reescrito
																// mesma assinatura do 	método da classe mãe
		
		System.out.println("Chamando o método de bonificação do Designer");		
		
//		return	super.getBonificacao() + 
//				200;											// Reaproveitando o 	método da classe mãe
		
		return	200;		
	}
}
