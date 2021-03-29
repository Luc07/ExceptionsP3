package atv2Questao03;

public class Main {
	public static void main(String[] args) throws Exception {
		ContaCorrente cc1 = new ContaCorrente();
		
		try {
			cc1.sacar((float) 200);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ValorInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			cc1.depositar((float) -10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			cc1.setValorLimite((float) -200);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
