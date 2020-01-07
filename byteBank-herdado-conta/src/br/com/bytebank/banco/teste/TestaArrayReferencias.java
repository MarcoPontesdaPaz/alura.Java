package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayReferencias {

	public static void main(String[] args) {

		Object referencias[] = new Object[5];

		referencias[0] = new ContaCorrente (1,2);
		referencias[1] = new ContaPoupanca (3,4);
		referencias[2] = new ContaCorrente (5,6);

		for (int i = 0; i < 3; i++) {
			
			if (referencias[i].getClass() == ContaCorrente.class)  {
				
				ContaCorrente refCC = (ContaCorrente) referencias[i];
				System.out.println("Conta corrente: Agência == " + refCC.getAgencia() + ", número == " + refCC.getNumero() );

			} else if (referencias[i].getClass() == ContaPoupanca.class) {

				ContaPoupanca refCP = (ContaPoupanca) referencias[i];
				System.out.println("Conta Poupanca: Agência == " + refCP.getAgencia() + ", número == " + refCP.getNumero() );				

			}		
		}
	}
}
