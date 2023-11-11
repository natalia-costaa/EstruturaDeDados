package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Funcionario extends Pessoa {
	
	private Integer matricula;
	private Double salario;
	private String dataAdmissao;
	private String cargo;
	
	public void cadastrar(String nome, String dataNascimento, String endereco, 
			String telsContato, Integer matricula, Double salario, String dataAdmissao, String cargo) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
	}
	
	public int tempoServico() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAdmit = LocalDate.parse(this.dataAdmissao, formato);
		LocalDate dataAtual = LocalDate.now();
		long servico = ChronoUnit.YEARS.between(dataAdmit, dataAtual);
		return (int)servico;
	}
	public void promover(String novoCargo) {
		this.cargo = novoCargo;
	}
	
	public double reajustarSalario(double percentual) {
		return this.salario = this.salario * percentual;
	}
		
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}


	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}


	

}
