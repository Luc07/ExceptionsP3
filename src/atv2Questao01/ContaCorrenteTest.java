package atv2Questao01;

import org.junit.Assert;
import org.junit.Test;

import atv2Questao02.ContaCorrente;
import atv2Questao02.ValorInsuficienteException;

public class ContaCorrenteTest {
	ContaCorrente cc1 = new ContaCorrente();
	

	@Test
	public void testSacar() throws IllegalArgumentException, ValorInsuficienteException {
		cc1.depositar((float) 200);
		//cc1.sacar((float)-200); lança exception de valor negativo (argument)
		//cc1.sacar((float)300); lança exception de valor insuficiente
		Assert.assertEquals((float) 200, cc1.getSaldo(), (float) 0.0001);
	}

	@Test
	public void testDepositar() {
		cc1.depositar((float) -20);
	}

	@Test
	public void testSetValorLimite() {
		cc1.setValorLimite((float) -2);
	}

}
