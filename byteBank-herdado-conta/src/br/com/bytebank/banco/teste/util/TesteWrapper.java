package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TesteWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);				//	Boxing
		int idadePrimitivo = idadeRef.intValue();			//	Unboxing

		String doubleString = "3.2";
		//Double doubleRef = 3.2;
		Double doubleRef = Double.valueOf(3.2);
		
		System.out.println(doubleString + 1);
		System.out.println(doubleRef + 1);		// auto unboxing
		System.out.println(doubleRef.doubleValue() + 1);
		
		Boolean bRef = Boolean.valueOf("true");
		System.out.println(bRef.booleanValue());
		
		
		List 			numeros = new ArrayList();
		List<Number> 	numbers = new ArrayList<Number>();
		
		//numeros.a
		numbers.add(2);
		

	}
}
