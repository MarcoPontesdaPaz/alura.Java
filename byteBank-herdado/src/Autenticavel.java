
// Contratao "Autenticavel"
	//	Quem assina este contrato, precisa implementar :
		// metodo setSenha
		// metodo autentica

public abstract interface Autenticavel {

	// Uma interface, � uma classe abstrata com todos os m�todos abstrados
	// -------------------------------------------------------------------
		
	public abstract void setSenha (int senha);

	public abstract boolean autentica (int senha) ;

}
