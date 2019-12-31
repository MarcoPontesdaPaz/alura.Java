
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public Gerente () {
		
	}
	
	public double getBonificacao () {							// sobrescrita - método da classe mãe reescrito
																// mesma assinatura do 	método da classe mãe

		return	super.getBonificacao() +						// Reaproveitando o 	método da classe mãe 
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

	public boolean autentica (int senha, String usuario) {		// sobrecarga de método
																// métodos, de uma mesma classe
		if (this.senha == senha) {								// com mesmo nome e assinaturas (parâmetros) diferentes
			return true;										// independente de visibilidade ou retorno
		} else {
			return false;
		}
	}	
}
