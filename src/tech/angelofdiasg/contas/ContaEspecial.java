package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - (valor * 0.99));
			return true;
		} 
		else {
			return false;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	


}
