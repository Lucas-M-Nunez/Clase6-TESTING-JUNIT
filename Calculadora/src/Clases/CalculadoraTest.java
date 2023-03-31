package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private Calculadora objCalculadoraTest;

	@BeforeEach
	public void setUp() {
		objCalculadoraTest = new Calculadora();
	}

	@Test
	public void testMultiplicarPunto1() {
		objCalculadoraTest.setNum1(80);
		objCalculadoraTest.setNum2(3);
		assertTrue(objCalculadoraTest.multiplicar(objCalculadoraTest.getNum1(),objCalculadoraTest.getNum2()) == (240));
	}

	@Test
	public void testSumarPunto2() {
		objCalculadoraTest.setNum1(150);
		objCalculadoraTest.setNum2(180);
		double suma = objCalculadoraTest.sumar(objCalculadoraTest.getNum1(), objCalculadoraTest.getNum2());
		assertTrue(objCalculadoraTest.dividir(suma, 3) == (110));
	}

	@Test
	public void testRestarPunto3() {
		objCalculadoraTest.setNum1(90);
		objCalculadoraTest.setNum2(50);
		double resta = objCalculadoraTest.restar(objCalculadoraTest.getNum1(), objCalculadoraTest.getNum2());
		assertTrue(objCalculadoraTest.multiplicar(resta,15) != (605));
	}
	
	@Test
	public void testSumarPunto4() {
		objCalculadoraTest.setNum1(70);
		objCalculadoraTest.setNum2(40);
		double suma = objCalculadoraTest.sumar(objCalculadoraTest.getNum1(), objCalculadoraTest.getNum2());
		assertTrue(objCalculadoraTest.multiplicar(suma, 25) != (2700));
	}

}
