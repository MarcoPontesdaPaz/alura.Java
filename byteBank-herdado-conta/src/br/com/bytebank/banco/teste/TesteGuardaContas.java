package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteGuardaContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 1);
		Conta cc2 = new ContaCorrente(22, 2222);
		

		guardador.adicionar (cc);
		guardador.adicionar (cc2);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println(guardador.getReferencia(1).getNumero());
		
	}
}
