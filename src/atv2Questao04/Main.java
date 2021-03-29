package atv2Questao04;

public class Main {
	public static void main(String[] args) {
		ConvertToCelsius c = new ConvertToCelsius();
		
		c.setFahrenheit(-459.68);
		try {
			System.out.println(c.getCelsius());
		} catch (FahrenheitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
