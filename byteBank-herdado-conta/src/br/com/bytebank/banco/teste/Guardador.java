package br.com.bytebank.banco.teste;

public class Guardador {

	private Object[] 	referencias;
	private int			posicaoLivre = 0;

	public Guardador() {
		this.referencias = new Object[10];
	}
	
	public void adicionar (Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}
}
