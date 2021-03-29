package atv2Questao07;

public class SaldoInsuficienteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// recebo meu saldo no parametro
	public SaldoInsuficienteException(double sal, double val) {
		super("Saldo de "+sal+ " é insuficiente para sacar o valor de "+val);
	}
}
