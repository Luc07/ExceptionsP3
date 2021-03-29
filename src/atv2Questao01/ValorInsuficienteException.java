package atv2Questao01;

public class ValorInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValorInsuficienteException() {
		super("O valor é insuficiente para sacar");
	}
	
}
