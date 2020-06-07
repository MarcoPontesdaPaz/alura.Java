package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraArquivoCSV {
		
	public static void main(String[] args) throws FileNotFoundException  {
	
		Scanner scanner = new Scanner (new File ("contas.csv"));				
		
		while (scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			String[] valores = linha.split(",");
			
			
//			for (int pos = 0; pos < valores.length ; pos ++) {
//				System.out.print(valores[pos] + " ");
//			}
//			System.out.println("");
			
//			System.out.println(Arrays.toString(valores));
			
			Scanner linhaScanner = new Scanner (linha);
			
			// parametriza o locale ( no interior do arquivo o separador de decimais é . (ponto)
			linhaScanner.useLocale(Locale.US);				// 
			
			// define o caracter de separação entre colunas
			linhaScanner.useDelimiter(",");

			// formatação
			System.out.println("Tipo:    [" + String.format("%s", linhaScanner.next()) + "]");
			System.out.println("Agencia: [" + String.format("%04d", linhaScanner.nextInt()) + "]");
			System.out.println("Conta:   [" + String.format("%04d", linhaScanner.nextInt()) + "]");
			System.out.println("Titular: [" + String.format("%20s", linhaScanner.next()) + "]");	
			System.out.println("Saldo:   [" + String.format(new Locale("pt", "BR"), "%015.2f \n", linhaScanner.nextFloat()) + "]");

//			System.out.format(new Locale ("pt", "BR"), 
//							  "%s  %04d  %04d  %20s  %015.2f \n", 
//							  linhaScanner.next(), linhaScanner.nextInt(), linhaScanner.nextInt(), linhaScanner.next(), linhaScanner.nextFloat());

			linhaScanner.close ();

		}
		scanner.close ();
	}
}