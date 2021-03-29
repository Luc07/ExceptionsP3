package atv2Questao07;

public class Conta {
	
	private double saldo;
	
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > this.saldo) {
			// passarei meu saldo pelo parametro de SaldoInsuficienteException
			throw new SaldoInsuficienteException(this.saldo, valor);
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
