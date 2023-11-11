package tech.angelofdiasg.app;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;
//import tech.angelofdiasg.contas.Conta;


public class MainDoApp {

	public static void main(String[] args) {
				
		Endereco endFunc  = new Endereco();
		Endereco endCliente  = new Endereco();
		endFunc.cadastrarEnd("Av Ruy Carneiro", "85", "0000", "JP","PB","BR");
		endCliente.cadastrarEnd("Av Epitacio Pessoa", "41", "1111", "JP","PB","BR");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.cadastrar("Pedro", "02/02/1987", endFunc, "222222", 12345, 12000.2 ,"03/03/2000","líder");
		
		Cliente cliente2 = new Cliente();
		cliente2.cadastrar("Ana", "01/01/1986", endCliente, "454545");
				
		System.out.printf("O funcionario %s tem %d anos e trabalha há %d anos na empresa.", 
				funcionario1.getNome(), funcionario1.obterIdade(), funcionario1.tempoServico());
			
		
		System.out.println("\n" + funcionario1.getNome() + " mora na" + funcionario1.getEndereco());

	}

}
