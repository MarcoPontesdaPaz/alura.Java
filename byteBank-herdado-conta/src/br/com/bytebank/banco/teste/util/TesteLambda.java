package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
// Source - Organize Imports
// Ctrl + Shift + O
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

// ctrl + shift + T = Find 

public class TesteLambda {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		
		// lista todas as contas antes do sort
		for (Conta conta : lista) {
			System.out.println(conta + " Titular == " + conta.getTitular().getNome() + ", Saldo == " + conta.getSaldo());
		}

		// DEFINE AS POSSIVEIS ORDENAÇOES

		// Ordena pelo número
		// Function Object

		//NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();
		
		//lista.sort(new NumeroDaContaComparator2());
		
//		lista.sort(new  Comparator<Conta> () {								// classes anônimas
//
//				@Override
//				public int compare(Conta c1, Conta c2) {
//					return Integer.compare(c1.getNumero(), c2.getNumero());
//				} 
//			}
//		);
		
//		lista.sort((Conta c1, Conta c2)-> {
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//		} 
		
		lista.sort(	
					(c1, c2)-> Integer.compare(c1.getNumero(), c2.getNumero()
				  )		
	);		
		
		
		// Ordena pelo nome do titular
		// ------------------------------------------------------------------------------

		// versão 1
		TitularDaContaComparator2 comparadorNome = new TitularDaContaComparator2 ();
		lista.sort (comparadorNome);	//
		//lista.sort (null);				//
		
		
		//Versão 2
		lista.sort(new TitularDaContaComparator2 ());
		
		// No java 7
		Collections.sort(lista, new TitularDaContaComparator2 ());
		
		Collections.sort(lista);		// sem comapartor, ver a ordem natural em Conta.compareTo ()
		
		
		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta + " Titular == " + conta.getTitular().getNome() + ", Saldo == " + conta.getSaldo());
		}
		System.out.println("==========");
		
//		lista.forEach(new Consumer<Conta>() {
//
//			@Override
//			public void accept(Conta conta) {
//				System.out.println(conta + " Titular == " + conta.getTitular().getNome() + ", Saldo == " + conta.getSaldo());
//			}
//		});

		
//		lista.forEach((Conta conta) -> {
//				System.out.println(conta + " Titular == " + conta.getTitular().getNome() + ", Saldo == " + conta.getSaldo());
//		});		

		lista.forEach((conta) -> 
					  System.out.println(conta + " Titular == " + conta.getTitular().getNome() + ", Saldo == " + conta.getSaldo())
		);				
	}
}

class TitularDaContaComparator2 implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

//		String nomeC1 = c1.getTitular().getNome();
//		String nomeC2 = c2.getTitular().getNome();
//		
//		int comparacao = nomeC1.compareTo(nomeC2);
//		return comparacao;
		
		// 
		return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
	}
}

class NumeroDaContaComparator2 implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		// se c1 < c2 return -1;
		// se iguais return 0;
		// se c1 > c2 return 1;

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		} else if (c1.getNumero() == c2.getNumero()) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		//return c1.getNumero() - c2.getNumero();

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}