package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoObjetoPessoa {

	public static void main(String[] args) throws IOException, Exception {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Marco Antônio Pontes");
		pessoa.setIdade(55);
		pessoa.setSexo("Masculino");

		// Serializacao Persistência
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.bin"));
		oos.writeObject(pessoa);
		oos.close();


		// Leitura
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream("pessoa.bin"));
		Pessoa pessoaLida = (Pessoa) ois.readObject();
		
		System.out.println(pessoaLida.getNome());
		System.out.println(pessoaLida.getIdade());
		System.out.println(pessoaLida.getSexo());
		
		ois.close();
	}
}