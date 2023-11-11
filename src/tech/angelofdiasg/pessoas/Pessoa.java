package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import tech.angelofdiasg.composicao.Endereco;

public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private String telsContato;

	
	public Pessoa() {
	}
	
	public void cadastrar(String nome, String dataNascimento, Endereco endereco, String telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	
	public int obterIdade() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNasc = LocalDate.parse(this.dataNascimento, formato);
		LocalDate dataAtual = LocalDate.now();
		long idade = ChronoUnit.YEARS.between(dataNasc, dataAtual);
		return (int)idade;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getTelsContato() {
		return telsContato;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelsContato(String telsContato) {
		this.telsContato = telsContato;
	}
	
	
	
}
