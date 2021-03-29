package atv2Questao05;

public class Conta {
	
	private double saldo;
	
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
