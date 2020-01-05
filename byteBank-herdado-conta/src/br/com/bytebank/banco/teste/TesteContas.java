package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

// Ctrl + Shift + O = set imports automaticamente

public class TesteContas {

	public static void main(String[] args) {

		// full qualified name FQN
		ContaCorrente cc = new ContaCorrente(1234, 1);
		cc.depositar(100);

		ContaPoupanca cp = new ContaPoupanca(1234, 2);
		cp.depositar(200);

		//cc.transferir(cp,  99.8);
		
		try {

			cc.sacar(201);
			//java.lang.System
			System.out.println("Saque realizado com sucesso. Saldo atual == " + cc.getSaldo());

		} catch (SaldoInsuficienteException ex ) {
			System.out.println(ex.getMessage());
		}
		
		//System.out.println("CP == " + cp.getSaldo());
	}
}
