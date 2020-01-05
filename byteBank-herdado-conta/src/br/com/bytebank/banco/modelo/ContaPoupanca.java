package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, 
			  			  int numero) {
		
		super(agencia, numero);
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
}
