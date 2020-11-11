import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste  {
	
	@Test
	void testeMMC() {
		Operacao op = new Operacao();
		int result = op.mmc(40, 180);
		assertEquals(360, result);
	}
	
	@Test
	void testeSoma() {
		Operacao op = new Operacao();
		int result = op.somaFracao(1, 10, 8, 10);
		assertEquals(9 + "/" + 10, result);;
	}
	
	@Test
	void testeSubtracao() {
		Operacao op = new Operacao(1, 4, 1, 8);
		int result = op.subtraiFracao();
		assertEquals(4 + "/" + 32, result);
	}
	
	@Test
	void testeMultiplicacao() {
		Operacao op = new Operacao();
		int result = op.multiplicaFracao(1, 3, 4, 5);
		assertEquals(4 + "/" + 15, result);
	}
	
	@Test
	void testeDivisao() {
		Operacao op = new Operacao();
		int result = op.divideFracao(8, 2, 1, 6);
		assertEquals(8 + "/" + 12, result);
	}
	
	@Test
	void testeIMC() {
		Operacao op = new Operacao();
		double result = op.imc(1.70, 69.20);
		assertEquals(23.94, result);
	}
	
	@Test
	void testeCelsiusToKelvin() {
		Operacao op = new Operacao();
		double result = op.celsiusToKelvin(40);
		assertEquals(313.15, result);
	}
	
	@Test
	void testeCelciusToFahrenheit() {
		Operacao op = new Operacao();
		double result = op.celsiusToFarenheit(40);
		assertEquals(104, result);
	}
	
	@Test
	void testeKelvintoCelcius() {
		Operacao op = new Operacao();
		double result = op.kelvinToCelsius(313);
		assertEquals(39.85, result);
	}
	
	@Test
	void testeKelvintoFarenheit() {
		Operacao op = new Operacao();
		double result = op.kelvinToFarenheit(280);
		assertEquals(44.33, result);
	}
	
	@Test
	void testeFarenheitToCelsius() {
		Operacao op = new Operacao();
		double result = op.farenheitToCelsius(86);
		assertEquals(30, result);
	}
	
	@Test
	void testeFarenheitToKelvin() {
		Operacao op = new Operacao();
		double result = op.farenheitToKelvin(50);
		assertEquals(283.15, result);
	}


}
