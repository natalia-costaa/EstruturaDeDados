package tech.angelofdiasg.app;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.composicao.Telefone;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenado;
import tech.angelofdiasg.pessoas.Cliente;

public class MainDoApp {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		Endereco endCliente  = new Endereco();
		ListaDeTelefonesNaoOrdenado listaCliente1 = new ListaDeTelefonesNaoOrdenado();
		
		Telefone telefone1 = new Telefone("11", "1234-5678");
		Telefone telefone2 = new Telefone("22", "9876-5432");
		Telefone telefone3 = new Telefone("33", "5555-1234");
		
		listaCliente1.addTelefoneNoSQL(telefone1);
		listaCliente1.addTelefoneNoSQL(telefone2);
		listaCliente1.addTelefoneNoSQL(telefone3);
		
		endCliente.cadastrarEnd("Av Epitacio Pessoa", "41", "1111", "JP","PB","BR");
		cliente1.cadastrar("X12", "Ana", "01/01/1986", endCliente, listaCliente1, "Desenvolvedor");
	
	    
	    listaCliente1.removerTelefone(telefone2);
	    
	    

	}

}
