package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo
		//FileInputStream fis = new FileInputStream("HospitaisUFRJ.txt");		// Stream 	- bits e bytes
		// o FileInputStream � um InputStream, ent�o podemos usar o conceito mais gen�rico ( polimorfismo )
		OutputStream fos = new FileOutputStream("HospitaisUFRJ_2.txt");				// Stream 	- bits e bytes
		
		//InputStreamReader	isr = new InputStreamReader(fis);				// Reader 	- caracteres
		// o InputStreamReader � um Reader, ent�o podemos usar o conceito mais gen�rico ( polimorfismo )
		Writer	osw = new OutputStreamWriter(fos);				// Reader 	- caracteres
		
		BufferedWriter	bw	= new BufferedWriter(osw);						// Buffered	- linhas

		
		bw.write("teste de Inclus�o");
		bw.newLine();
		bw.write("=================================");
		bw.write("fim !");
		bw.write("=================================");

		bw.close();
	}
}
