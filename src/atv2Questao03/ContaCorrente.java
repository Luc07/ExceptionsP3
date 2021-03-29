package atv2Questao03;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;
	
	public void sacar(float valor) throws Exception, ValorInsuficienteException {
		if(valor < 0) {
			throw new Exception();
		}else if (valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			throw new ValorInsuficienteException();
		}
	}
	
	public void depositar(float valor) throws Exception{
		if(valor < 0) {
			throw new Exception();
		}else {
			this.saldo += valor;
		}
	}
	
	public void setValorLimite(float valor) throws Exception{
		if(valor < 0) {
			throw new Exception();
		}else {
			this.valorLimite = valor;
		}
	}

	public float getSaldo() {
		return this.saldo;
	}
	
}
