package atv2Questao07;

public class Main {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.depositar(200);
		try {
			c.sacar(201);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
