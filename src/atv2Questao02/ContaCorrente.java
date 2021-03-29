package atv2Questao02;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;
	
	public void sacar(float valor) throws IllegalArgumentException, ValorInsuficienteException {
		if(valor < 0) {
			throw new IllegalArgumentException("Não é possivel sacar valor negativo");
		}else if (valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			throw new ValorInsuficienteException();
		}
	}
	
	public void depositar(float valor) throws IllegalArgumentException{
		if(valor < 0) {
			throw new IllegalArgumentException("Não é possivel depositar valores negativos");
		}else {
			this.saldo += valor;
		}
	}
	
	public void setValorLimite(float valor) throws IllegalArgumentException{
		if(valor < 0) {
			throw new IllegalArgumentException("Não é possivel setar valor limite negativo");
		}else {
			this.valorLimite = valor;
		}
	}

	public float getSaldo() {
		return this.saldo;
	}
	
}
