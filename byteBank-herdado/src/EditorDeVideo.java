
public class EditorDeVideo extends Funcionario{

	public EditorDeVideo () {
		
	}
	
	public double getBonificacao () {							// sobrescrita - m�todo da classe m�e reescrito
																// mesma assinatura do 	m�todo da classe m�e
		
		System.out.println("Chamando o m�todo de bonifica��o do Editor de V�deo");		
		
//		return	super.getBonificacao() + 
//				100;											// Reaproveitando o 	m�todo da classe m�e

		return	100;											// Reaproveitando o 	m�todo da classe m�e
		
	}
}
