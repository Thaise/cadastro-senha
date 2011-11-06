import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroSenhaDivisaoTest {

	@Test
	public void deveraApresentarResultadoDeUmaDivisaoCasoASenhaSejaCorreta() throws CalculaDivisaoException {
		double divisao = CalculaDivisao.calcularDivisao("12589", 10, 2, "12589");
		assertEquals(5, divisao, 0);
	}
	
	@Test(expected = CalculaDivisaoException.class)
	public void nãoDeveraApresentarResultadoDeUmaDivisaoPoisSenhaEIncorreta() throws CalculaDivisaoException {
		double divisao = CalculaDivisao.calcularDivisao("ola", 10, 3, "olá!");
		assertEquals(0, divisao, 0);
	}
	
	@Test(expected = CalculaDivisaoException.class)
	public void nãoDeveraApresentarResultadoDeUmaDivisaoPoisSenhaEIncorreta2() throws CalculaDivisaoException {
		double divisao = CalculaDivisao.calcularDivisao("ola", 10, 0, "ola");
		assertEquals(5, divisao, 0);
	}

}
