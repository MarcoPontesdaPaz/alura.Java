
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public Gerente () {
		
	}
	
	public double getBonificacao () {							// sobrescrita - m�todo da classe m�e reescrito
																// mesma assinatura do 	m�todo da classe m�e

		return	super.getBonificacao() +						// Reaproveitando o 	m�todo da classe m�e 
				super.getSalario();
		
		//return super.getSalario();
		//return super
	}

	public void setSenha (int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public boolean autentica (int senha, String usuario) {		// sobrecarga de m�todo
																// m�todos, de uma mesma classe
		if (this.senha == senha) {								// com mesmo nome e assinaturas (par�metros) diferentes
			return true;										// independente de visibilidade ou retorno
		} else {
			return false;
		}
	}	
}
