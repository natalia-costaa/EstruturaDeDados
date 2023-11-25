package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.composicao.Telefone;

public class ListaDeTelefonesNaoOrdenado {
	
	private Telefone[] telefones;
	private int tamanho;
	private static final int CAPACIDADE_PADRAO = 10;

	
		
	public ListaDeTelefonesNaoOrdenado(Telefone[] telefones) {
		this.telefones = new Telefone[CAPACIDADE_PADRAO];
		tamanho = 0;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	
	public boolean isFull() {
		return tamanho == telefones.length;
	}
	
	public void addTelefone(Telefone tels) {
		if(tamanho <= CAPACIDADE_PADRAO) {
			telefones[tamanho] = tels;
			tamanho++;
		}
	}
	
	public void removerTelefone(Telefone telefone) {
		int index = buscarTelefoneIndex(telefone);
	}

	private int buscarTelefoneIndex(Telefone telefone) {
		for(int i = 0; i < tamanho; i++) {
			if(telefones[i].equals(telefone)) {
				return i;
			}
		}
		return 0;
	}
	
	

	

}
