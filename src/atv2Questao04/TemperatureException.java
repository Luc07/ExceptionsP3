package atv2Questao04;

public class TemperatureException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TemperatureException() {
		super("Valor convertido não deve ser menor que zero absoluto");
	}
}
