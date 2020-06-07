package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter_e_BufferedWriter {

	public static void main(String[] args) throws IOException {

		//FileWriter fw = new FileWriter("HospitaisUFRJ_FileWriter.txt");

		//fw.write ("teste de Inclusão");
		//fw.write("\r\n");																		// para windows precisa do \r (CR)
		//fw.write ("=================================");
		//fw.write(System.lineSeparator());														// baseado no SO
		//fw.write ("=================================");
		//fw.write(System.lineSeparator());
		//fw.write ("=================================");
		//fw.close ();

		// usando o BufferedWriter com o FileWriter
		// um pouco mais alto nível, por conta do método newLine()
		//BufferedWriter	bw	= new BufferedWriter(fw);										// Buffered	- linhas

		// observar aqui a criação do FileWriter, já na chamada do BufferedWriter
		BufferedWriter	bw	= new BufferedWriter(new FileWriter("HospitaisUFRJ_FileWriter.txt"));										// Buffered	- linhas

		bw.write ("teste de Inclusão");
		bw.newLine();
		bw.write ("FileWriter & BufferedWriter");
		bw.newLine();
		bw.write ("=================================");
		bw.newLine();
		bw.write ("=================================");
		bw.close ();		
	}
}
