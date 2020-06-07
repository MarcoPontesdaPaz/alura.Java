package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStream_e_PrintWriter {

	public static void main(String[] args) throws IOException {

		//FileWriter fw = new FileWriter("HospitaisUFRJ_FileWriter.txt");

		//fw.write ("teste de Inclus�o");
		//fw.write("\r\n");																					// para windows precisa do \r (CR)
		//fw.write ("=================================");
		//fw.write(System.lineSeparator());																	// baseado no SO
		//fw.write ("=================================");
		//fw.write(System.lineSeparator());
		//fw.write ("=================================");
		//fw.close ();

		// usando o BufferedWriter com o FileWriter
		// um pouco mais alto n�vel, por conta do m�todo newLine()
		//BufferedWriter	bw	= new BufferedWriter(fw);													// Buffered	- linhas

		// observar aqui a cria��o do FileWriter, j� na chamada do BufferedWriter
		//BufferedWriter	bw	= new BufferedWriter(new FileWriter("HospitaisUFRJ_FileWriter.txt"));		// Buffered	- linhas
		//bw.write ("teste de Inclus�o");
		//bw.newLine();
		//bw.write ("=================================");
		//bw.newLine();
		//bw.write ("=================================");
		//bw.newLine();
		//bw.write ("=================================");
		//bw.close ();		
		
		//PrintStream ps = new PrintStream("HospitaisUFRJ_PrintStream.txt");
		
		PrintWriter ps = new PrintWriter("HospitaisUFRJ_PrintWriter.txt");
		
		ps.println("teste de Inclus�o");
		ps.println("PrintWriter");
		ps.println("=================================");
		ps.println("=================================");
		ps.println("=================================");
		ps.close();
				
	}
}
