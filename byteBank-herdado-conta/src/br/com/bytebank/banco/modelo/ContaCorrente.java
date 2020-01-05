package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	// Não herda constutores
	
	public ContaCorrente (int agencia, 
			  			  int numero) {

		super(agencia, numero);
	}
	
//	@Override
//	public boolean sacar(double valorSaque) {
//
//		return super.sacar(valorSaque + 0.20);
//	}
	
	@Override
	public void sacar(double valorSaque) throws SaldoInsuficienteException {
		super.sacar(valorSaque + 0.20);
	}	

	@Override
	public boolean depositar(double valorDeposito) {

		if (valorDeposito < 0) {
			return false;
		} else {
		
			super.saldo += valorDeposito;
			return true;
		}
	}

	@Override
	public double getValorImposto() {
		
		return super.getSaldo() * 0.01;
	}
}