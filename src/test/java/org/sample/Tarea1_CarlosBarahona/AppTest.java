package org.sample.Tarea1_CarlosBarahona;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

/**
 * Unit test for simple App.
 */



public class AppTest
{
	
	private static App metodosArea;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Se acaba de ejecutar el metodo setup class");
		metodosArea = new App();
	}

	@Test
	public void probandoAreaCirculo_Test_1() {
		double radio = 2.55;
		double resultado = metodosArea.areaCirculo(radio);
		assertEquals(resultado, 20.43, 0.001);
	}
	
	@Test
	public void probandoAreaCirculo_Test_2() {
		double radio = 2.55;
		double resultado = metodosArea.areaCirculo(radio);
		assertTrue(resultado == 20.43);
	}
	
	@Test
	public void probandoAreaCirculo_Test_3() {
		double radio = 2.55;
		double resultado = metodosArea.areaCirculo(radio);
		assertNotEquals(resultado, 28.34, 0.001);
	}
	
	@Test
	public void probandoAreaCuadrado_Test_1() {
		double lado = 8.73;
		double resultado = metodosArea.areaCuadrado(lado);
		assertEquals(resultado, 76.21, 0.001);
	}
	
	@Test
	public void probandoAreaCuadrado_Test_2() {
		double lado = 8.73;
		double resultado = metodosArea.areaCuadrado(lado);
		assertTrue(resultado == 76.21);
	}
	
	@Test
	public void probandoAreaCuadrado_Test_3() {
		double lado = 8.73;
		double resultado = metodosArea.areaCuadrado(lado);
		assertNotEquals(resultado, 85.31, 0.001);
	}
	
	@Test
	public void probandoAreaRectangulo_Test_1() {
		double base = 15.21;
		double altura = 27.13;
		double resultado = metodosArea.areaRectangulo(base, altura);
		assertEquals(resultado, 412.65, 0.001);
	}
	
	@Test
	public void probandoAreaRectangulo_Test_2() {
		double base = 15.21;
		double altura = 27.13;
		double resultado = metodosArea.areaRectangulo(base, altura);
		assertTrue(resultado == 412.65);
	}
	
	@Test
	public void probandoAreaRectangulo_Test_3() {
		double base = 15.21;
		double altura = 27.13;
		double resultado = metodosArea.areaRectangulo(base, altura);
		assertNotEquals(resultado, 278.25, 0.001);
	}
	
	
	@Test
	public void probandoAreaTriangulo_Test_1() {
		double base = 26.11;
		double altura = 35.37;
		double resultado = metodosArea.areaTriangulo(base, altura);
		assertEquals(resultado, 461.76, 0.001);
	}
	
	@Test
	public void probandoAreaTriangulo_Test_2() {
		double base = 26.11;
		double altura = 35.37;
		double resultado = metodosArea.areaTriangulo(base, altura);
		assertTrue(resultado == 461.76);
	}
	
	@Test
	public void probandoAreaTriangulo_Test_3() {
		double base = 26.11;
		double altura = 35.37;
		double resultado = metodosArea.areaTriangulo(base, altura);
		assertNotEquals(resultado, 845.76, 0.001);
	}
}
