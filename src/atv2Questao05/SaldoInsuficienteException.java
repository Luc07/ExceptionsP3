package atv2Questao05;

public class SaldoInsuficienteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super("Saldo insuficiente");
	}
}
