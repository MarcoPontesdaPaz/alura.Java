package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TesteWrappersOutros {

	public static void main(String[] args) {

		int numerosPrimitivos[] = new int [5];				// array de primitivos
		
		List numerosList = new ArrayList();					// list ( usa array internamente )
		
		String nomes[] = new String [10];					// array de referencias
		
		Object referencias = new Objects[10];				// array de referencias Object
		
		// Listas 		só de referencias
		// Collections 	só de referencias

		int idade = 29;										// Integer classe correspondente		// java.lang.Integer
															// Classes Wrapper						// Autoboxing & Unboxing
		Integer idadeInteger = new Integer(29);
		Integer idadeValueOf = Integer.valueOf(29);			// valueOf - Inicialização de classes wrapper
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);							
		
		Integer idadeRef = Integer.valueOf(29);				//	Boxing
		int idadePrimitivo = idadeRef.intValue();			//	Unboxing
		
		System.out.println(idadePrimitivo);
		
		
		String s = args[0];
		Integer numeroArg = Integer.valueOf(args[0]);
		int numeroInt = Integer.parseInt(args[0]);
		System.out.println(numeroArg);
		System.out.println(numeroInt);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		

		
	}
}
