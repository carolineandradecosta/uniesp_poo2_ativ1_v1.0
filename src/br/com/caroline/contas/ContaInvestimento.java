package br.com.caroline.contas;


public class ContaInvestimento extends Conta {
	private double taxa;
	private int prazo;
	
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			double novoSaldo = getSaldo() 
					- (valor * 1.01);
			setSaldo(novoSaldo);
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		setSaldo(getSaldo() + (valor * 1.02));
		return true;
	}

	public void aplicarRendimento(double taxa){
		// L�gica de aplica��o de rendimento
	}

	public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
		super(numero, saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
}
