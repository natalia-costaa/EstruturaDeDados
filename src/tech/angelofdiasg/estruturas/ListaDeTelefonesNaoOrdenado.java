package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.composicao.Telefone;

public class ListaDeTelefonesNaoOrdenado {
	
	private Telefone[] telefones;
	private int size;
	private static final int CAPACIDADE_PADRAO = 10;

	
		
	public ListaDeTelefonesNaoOrdenado(Telefone[] telefones) {
		this.telefones = new Telefone[CAPACIDADE_PADRAO];
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == telefones.length;
	}
	
	private void garantirCapacidade() {
		int novaCapacidade = telefones.length * 2;
		Telefone[] listaDeTelefones = new Telefone[novaCapacidade];
		for(int i = 1; i < size; i++) {
			listaDeTelefones[i] = telefones[i];
		}
		
		telefones = listaDeTelefones;
	}
	
	public void addTelefoneNoSQL(Telefone telefone) {
		
	}
	
	

	

}
