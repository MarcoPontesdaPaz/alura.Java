package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		String nome = "Alura";		// object literal
		String nomeDois = new String ("nome Dois");

		nome = nome.replace('A', 'a');

		nome.toLowerCase();
		nome.toUpperCase();

		System.out.println(nome);
		System.out.println(nome.replace('A', 'a'));
		System.out.println(nome.charAt(2));			// começa do zero
		System.out.println(nome.indexOf("ur"));
		System.out.println(nome.substring(1, 5));
		System.out.println("nome.length() = " + nome.length());
		
		for ( int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		String vazio = " ";
		vazio = vazio.trim();
		System.out.println(vazio.isEmpty());
		
		String outra = " pontes ";
		System.out.println(outra.contains("onte"));

	}
}
// alura
// 01234