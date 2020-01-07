package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteUtilArrayListEquals {

	public static void main(String[] args) {
		
		// Generics 
		//	só permite referencias do tipo definido entre <>
		ArrayList<Conta> 	lista = new ArrayList<Conta>();			// é um guardador de referencias

		ContaCorrente cc1 = new ContaCorrente(1, 2);
		ContaPoupanca cp2 = new ContaPoupanca(3, 4);
		ContaCorrente cc2 = new ContaCorrente(1, 2);

		lista.add(cc1);					// observe o polimorfismo
		lista.add(cp2);		

		System.out.println("Quantidade armazenada == " + lista.size());
		
		for (Object oRef : lista) {
			System.out.println(oRef.toString());
		}		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Já existe (" + cc2.toString() + ")? " + lista.contains(cc2));

		for (Conta conta : lista) {

			if (conta.equals(cc2)) {
				System.out.println("Já tenho esta referencia");
			}
			
			if (lista.contains(cc2)) {
				System.out.println("Já tenho esta referencia");
			}		
		}
	}
}
