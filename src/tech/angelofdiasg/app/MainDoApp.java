package tech.angelofdiasg.app;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.composicao.Telefone;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;


public class MainDoApp {

	public static void main(String[] args) {
				
		Endereco endFunc = new Endereco();
		Endereco endCliente  = new Endereco();
		Funcionario funcionario1 = new Funcionario();
		Cliente cliente2 = new Cliente();

		endFunc.cadastrarEnd("Av Ruy Carneiro", "85", "0000", "JP","PB","BR");
		Telefone telsFunc = new Telefone("83", "111111");
		funcionario1.cadastrar("Pedro", "02/02/1987", endFunc, telsFunc, 12345, 1000.2 ,"03/03/2000","líder");
		
		endCliente.cadastrarEnd("Av Epitacio Pessoa", "41", "1111", "JP","PB","BR");
		Telefone telsClient = new Telefone("83", "222222");
		cliente2.cadastrar("X12", "Ana", "01/01/1986", endCliente, telsClient, "Desenvolvedor");
		
				
		System.out.printf("O funcionario %s tem %d anos e trabalha há %d anos na empresa.", 
				funcionario1.getNome(), funcionario1.obterIdade(), funcionario1.tempoServico());
			
		
		System.out.println("\n" + funcionario1.getNome() + " mora na" + funcionario1.getEndereco());
		
		System.out.println(cliente2.getCodigo() + " mora na" + cliente2.getEndereco());
		
		funcionario1.reajustarSalario(12.5);
		System.out.printf("O novo salario de %s é %.2f reais.", funcionario1.getNome(), funcionario1.getSalario());
		
		

	}

}
