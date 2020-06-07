package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoObjeto {

	public static void main(String[] args) throws IOException, Exception {
		
//		Cliente cliente = new Cliente ();
//		cliente.setCpf("898.405.857-20");
//		cliente.setNome("Marco Pontes");
//		cliente.setProfissao("Programador");

//		// Serializacao Persistência
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		// Leitura
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream("cliente.bin"));
		Cliente clienteLido = (Cliente) ois.readObject();
		
		System.out.println(clienteLido.getNome());
		System.out.println(clienteLido.getCpf());
		System.out.println(clienteLido.getProfissao());
	}
}