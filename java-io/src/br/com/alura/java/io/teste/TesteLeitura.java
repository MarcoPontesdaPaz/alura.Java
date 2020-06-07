package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo
		//FileInputStream fis = new FileInputStream("HospitaisUFRJ.txt");		// Stream 	- bits e bytes
		// o FileInputStream é um InputStream, então podemos usar o conceito mais genérico ( polimorfismo )
		InputStream fis = new FileInputStream("HospitaisUFRJ.txt");				// Stream 	- bits e bytes
		
		/*
		// lendo os caracteres em bytes ( número )
		int myByte = 0;

		myByte = fis.read ();
		while (myByte != -1) {
			
			if (myByte != 13) {
				System.out.printf("%c", myByte);
			}

			myByte = fis.read ();
		}
		*/		

		// lendo os caracteres em char ( string )
		
		//InputStreamReader	isr = new InputStreamReader(fis);				// Reader 	- caracteres
		// o InputStreamReader é um Reader, então podemos usar o conceito mais genérico ( polimorfismo )
		Reader	isr = new InputStreamReader(fis);				// Reader 	- caracteres
		
		BufferedReader	br	= new BufferedReader(isr);						// Buffered	- linhas

		System.out.println("\n---------------------------------------------\n");

		// leitura
		
		String linha = br.readLine();
		
		while (linha != null) {
		
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}
}
