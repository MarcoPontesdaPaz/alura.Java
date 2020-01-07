package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteUtilGenerics {
	
	//TesteUtilGenerics
	//TesteUtilArrayListEquals

	public static void main(String[] args) {
		
		// Generics 
		//	só permite referencias do tipo definido entre <>
		ArrayList<Conta> 	lista = new ArrayList<Conta>();			// é um guardador de referencias
		
		ContaCorrente	cc;
		ContaPoupanca	cp;
		Cliente			c;
		SeguroDeVida	sv1;
		
		ContaCorrente cc1 = new ContaCorrente(1, 2);
		ContaPoupanca cc2 = new ContaPoupanca(3, 4);
		Cliente	  cliente = new Cliente ();
		cliente.setNome("marco");
		SeguroDeVida   sv = new SeguroDeVida();
		
		lista.add(cc1);					// observe o polimorfismo
		lista.add(cc2);
		//lista.add(cliente);
		//lista.add(sv);
		
		System.out.println("Quantidade armazenada == " + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getClass() == cc1.getClass()) {

				cc = (ContaCorrente) lista.get(i);
				System.out.println("Posição == " + i + " Conta corrente : " + cc.toString());

			} else if (lista.get(i).getClass() == cc2.getClass()) {

				cp = (ContaPoupanca) lista.get(i);
				System.out.println("Posição == " + i + " Conta Poupança : " + cp.toString());				

//			}  else if (lista.get(i).getClass() == cliente.getClass()) {
//
//				c = (Cliente) lista.get(i);
//				System.out.println("Posição == " + i + " Cliente : " + c.getNome());				
//
//			}  else if (lista.get(i).getClass() == sv.getClass()) {
//
//				sv1 = (SeguroDeVida) lista.get(i);
//				System.out.println("Posição == " + i + " Seguro de vida : " + sv1.getValorImposto());				

			}
		}
		System.out.println("------------------------");
		
		//lista.remove(3);
		//System.out.println("Quantidade armazenada == " + lista.size());
		
		for (Object oRef : lista) {
			
			if (oRef.getClass() == cc1.getClass()) {

				cc = (ContaCorrente) oRef;
				System.out.println("Conta corrente : " + cc.toString());

			} else if (oRef.getClass() == cc2.getClass()) {

				cp = (ContaPoupanca) oRef;
				System.out.println("Conta Poupança : " + cp.toString());				

			}  else if (oRef.getClass() == cliente.getClass()) {

				c = (Cliente) oRef;
				System.out.println("Cliente : " + c.getNome());				

			}  else if (oRef.getClass() == sv.getClass()) {

				sv1 = (SeguroDeVida) oRef;
				System.out.println("Seguro de vida : " + sv1.getValorImposto());				
			}
		}			
	}
}
