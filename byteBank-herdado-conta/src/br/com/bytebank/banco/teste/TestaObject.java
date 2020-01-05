package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaObject {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 456);
		
		exibe (cc);

	}
	
	public static void exibe (Object obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
}
