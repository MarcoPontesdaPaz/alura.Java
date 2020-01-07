package br.com.bytebank.banco.modelo;


/**
 * Classe que representa uma conta, no byte bank
 * 
 * @author marco
 * @
 */
public abstract class Conta {

	protected double 	saldo;
	private	int		agencia;
	private	int		numero;
	private	Cliente	titular = new Cliente();
	
	private static int totalContas = 0; 
	
	public Conta () {
		
		totalContas++;
	}
	
	/**
	 * Construtor
	 * 
	 * @author marco
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta (int agencia, 
				  int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;

		Conta.totalContas ++;
	}
	
	public static int getTotalContas () {
		return Conta.totalContas;
	}
	
//	public boolean depositar (double valorDeposito)  {
//		
//		if (valorDeposito < 0) {
//			return false;
//		} else {
//		
//			this.saldo += valorDeposito;
//			return true;
//		}
//	}

	public abstract boolean depositar (double valorDeposito);
	
	
//	public boolean sacar (double valorSaque) {
//		
//		if (this.saldo >= valorSaque) {
//			
//			this.saldo -= valorSaque;
//			return true;
//			
//		} else {
//			return false;
//		}
//	}
	
	public void sacar (double valorSaque) throws SaldoInsuficienteException{
		
		if (this.saldo < valorSaque) {
			
			throw new SaldoInsuficienteException("Saldo Insuficiente = " + this.saldo + ", valor a sacar == " + valorSaque);
			
		} else {
			this.saldo -= valorSaque;		
		} 
	}	
	
//	public boolean transferir (Conta contaFavorecida, double valorTransferencia) {
//	
//		if (this.saldo < valorTransferencia) {								// verifica se tem saldo
//
//			return false;
//
//		} else if (! this.sacar(valorTransferencia)) {						// saque a conta cedente ( this )
//
//			return false;
//
//		} else if (! contaFavorecida.depositar(valorTransferencia)) {		// faz o deposito na conta favorecida
//			
//			return false;
//			
//		} else {
//			return true;
//		}
//	}
	
	public boolean transferir (Conta contaFavorecida, double valorTransferencia) throws SaldoInsuficienteException{
		
		this.sacar(valorTransferencia);

		if (! contaFavorecida.depositar(valorTransferencia)) {		// faz o deposito na conta favorecida
			return false;
		} else {
			return true;
		}
	}	
	
	public double getSaldo () {
		return this.saldo;
	}

	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero (int numero) {
		
		if (numero <= 0) {
			//
		} else {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			//
		} else {
			this.agencia = agencia;
		}
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	@Override
	public String toString() {
		
		return "Conta :" + this.getNumero() + " - agência : " + this.getAgencia();
		
	}

	@Override
	public boolean equals(Object conta) {

		if (this.agencia 		!= ((Conta) conta).getAgencia()) {
			return false;
		} else if (this.numero 	!= ((Conta) conta).getNumero()) {
			return false;
		} else {
			return true;
		}
	}

//	public boolean ehIgual(ContaCorrente cc2) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}