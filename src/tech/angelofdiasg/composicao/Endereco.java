package tech.angelofdiasg.composicao;

public class Endereco {
	
	 	private String rua;
	    private String numero;
	    private String cep;
	    private String cidade;
	    private String estado;
	    private String pais;


	    public void cadastrarEnd(String rua, String numero, String cep, String cidade, String estado, String pais) {
	        this.rua = rua;
	        this.numero = numero;
	        this.cep = cep;
	        this.cidade = cidade;
	        this.estado = estado;
	        this.pais = pais;
	    }

	    public String getRua() {
	        return rua;
	    }

	    public void setRua(String rua) {
	        this.rua = rua;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public void setNumero(String numero) {
	        this.numero = numero;
	    }

	    public String getCep() {
	        return cep;
	    }

	    public void setCep(String cep) {
	        this.cep = cep;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }

	    public String getPais() {
	        return pais;
	    }

	    public void setPais(String pais) {
	        this.pais = pais;
	    }

	    @Override
	    public String toString() {
	        return " rua " + rua + " de numero " + numero + " com CEP " +
	                cep + " na cidade de " + cidade + " do estado " + estado + " no pais " + pais + ".";
	    }

}
