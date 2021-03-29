package atv2Questao04;

public class ConvertToCelsius {
	private static final double ZERO_ABSOLUTO = -459.67;
	private double fahrenheit;
	TemperatureUtils t = new TemperatureUtils();
	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}

	/**
	 * @param fahrenheit the fahrenheit to set
	 */
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double getCelsius() throws FahrenheitException{
		double c = (t.toCelsius(fahrenheit) * 9 / 5) + 32;
		if(c < ZERO_ABSOLUTO ) {
			throw new FahrenheitException();
		}else {
			return t.toCelsius(fahrenheit);
		}
	}
}
