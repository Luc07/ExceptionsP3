package atv2Questao03;

public class ValorInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValorInsuficienteException() {
		super("O valor ? insuficiente para sacar");
	}
	
}
