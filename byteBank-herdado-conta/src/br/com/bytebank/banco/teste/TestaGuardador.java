package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TestaGuardador {
	
	public static void main(String[] args) {

		Guardador itens = new Guardador();
		
		ContaCorrente	cc;
		ContaPoupanca	cp;
		Cliente			c;
		SeguroDeVida	sv1;
		
		ContaCorrente cc1 = new ContaCorrente(1, 2);
		ContaPoupanca cc2 = new ContaPoupanca(3, 4);
		Cliente	  cliente = new Cliente ();
		cliente.setNome("marco");
		SeguroDeVida   sv = new SeguroDeVida();
		
		itens.adicionar(cc1);
		itens.adicionar(cc2);
		itens.adicionar(cliente);
		itens.adicionar(sv);

		System.out.println("Quantidade armazenada == " + itens.getQuantidadeElementos());
		
		for (int i = 0; i < itens.getQuantidadeElementos(); i++) {
			
			if (itens.getReferencia(i).getClass() == cc1.getClass()) {

				cc = (ContaCorrente) itens.getReferencia(i);
				System.out.println("Posição == " + i + " Conta corrente : " + cc.toString());

			} else if (itens.getReferencia(i).getClass() == cc2.getClass()) {

				cp = (ContaPoupanca) itens.getReferencia(i);
				System.out.println("Posição == " + i + " Conta Poupança : " + cp.toString());				

			}  else if (itens.getReferencia(i).getClass() == cliente.getClass()) {

				c = (Cliente) itens.getReferencia(i);
				System.out.println("Posição == " + i + " Cliente : " + c.getNome());				

			}  else if (itens.getReferencia(i).getClass() == sv.getClass()) {

				sv1 = (SeguroDeVida) itens.getReferencia(i);
				System.out.println("Posição == " + i + " Seguro de vida : " + sv1.getValorImposto());				

			}
		}
	}
}
