
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador; 
	
	public Administrador () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao () {							// sobrescrita - m�todo da classe m�e reescrito
																// mesma assinatura do 	m�todo da classe m�e
		System.out.println("Chamando o m�todo de bonifica��o do Administrador");		
		return	50;		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}	
