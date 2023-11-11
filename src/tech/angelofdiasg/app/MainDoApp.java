package tech.angelofdiasg.app;

import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;
//import tech.angelofdiasg.contas.Conta;


public class MainDoApp {

	public static void main(String[] args) {
				
		Funcionario funcionario1 = new Funcionario();
		funcionario1.cadastrar("Luis", "18/09/1986", "Aqui naUniesp", "Ta no slide", 11111111, 1111.11, "18/09/1996", "Prof");
		
		Cliente cliente2 = new Cliente();
		cliente2.cadastrar("Ana","20/12/2000", "Rua dos Milagres", "22222222", "12345", "estudante");
		
				
		System.out.printf("O funcionario %s tem %d anos e trabalha há %d anos na empresa.", 
				funcionario1.getNome(), funcionario1.obterIdade(), funcionario1.tempoServico());
		
		System.out.println();

	}

}
