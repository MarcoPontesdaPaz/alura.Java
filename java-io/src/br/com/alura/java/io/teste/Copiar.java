package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Copiar {

	public static void main(String[] args) throws IOException {
		
		InputStream fis  = new FileInputStream ("HospitaisUFRJ.txt");				// Stream 	- bits e bytes
		OutputStream fos = new FileOutputStream("HospitaisUFRJ_Copia.txt");			// Stream 	- bits e bytes
	
		Reader	isr = new InputStreamReader(fis);									// Reader 	- caracteres
		Writer	osw = new OutputStreamWriter(fos);									// Writer	- caracteres
		
		BufferedReader	br	= new BufferedReader(isr);								// Buffered	- linhas
		BufferedWriter	bw	= new BufferedWriter(osw);								// Buffered	- linhas


		// leitura		
		String linha = br.readLine();
		
		while (linha != null) {
		
			System.out.println(linha);
			
			bw.write(linha);
			bw.newLine();
			
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
