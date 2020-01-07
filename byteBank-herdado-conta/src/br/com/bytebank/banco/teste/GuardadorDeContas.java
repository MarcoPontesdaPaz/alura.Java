package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int		posicaoLivre = 0;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
	}
	
	public void adicionar (Conta ref) {

		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		
		return this.posicaoLivre;
	}

	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
	}
}