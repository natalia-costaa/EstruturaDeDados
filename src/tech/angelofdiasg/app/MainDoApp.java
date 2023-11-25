package tech.angelofdiasg.app;

import tech.angelofdiasg.composicao.Telefone;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenado;

public class MainDoApp {

	public static void main(String[] args) {
		
		ListaDeTelefonesNaoOrdenado minhaLista = new ListaDeTelefonesNaoOrdenado();
				
	    Telefone telefone1 = new Telefone("11", "1234-5678");
	    Telefone telefone2 = new Telefone("22", "9876-5432");
	    Telefone telefone3 = new Telefone("33", "5555-1234");
	    
	    minhaLista.addTelefoneNoSQL(telefone1);
	    minhaLista.addTelefoneNoSQL(telefone2);
	    minhaLista.addTelefoneNoSQL(telefone3);
	    
	    minhaLista.removerTelefone(telefone2);
	    minhaLista.exibirTelefones();
	     

	}

}
