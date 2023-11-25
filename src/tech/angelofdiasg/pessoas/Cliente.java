package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenado;

public class Cliente extends Pessoa {
	
	private String codigo;
	private String profissao;
	
		
	public void cadastrar(String codigo, String nome, String dataNascimento, 
			Endereco endereco, ListaDeTelefonesNaoOrdenado listaTelsContato, String profissao) {
		this.codigo = codigo;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setListaTelsContato(listaTelsContato);
		this.profissao = profissao;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
