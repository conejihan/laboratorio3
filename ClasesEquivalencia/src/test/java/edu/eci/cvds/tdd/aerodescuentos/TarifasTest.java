package edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest{
	
	@Test
	public void deberiaParametrosSerPositivos(){
		double res = calculoTarifa(100000,20,27);
		assertEquals(res,80000);
	}
	
	@Test (expected = ExcepcionParametrosInvalidos.class)
	public void deberiaSacarErrorSiSonNegativos(){
		double res = calculoTarifa(320000,22,-12);
		throw new ExcepcionParametrosInvalidos();
	}
	
	@Test (expected = ExcepcionParametrosInvalidos.class)
	public void deberiaSacarErrorSiEsNulo(){
		double res = calculoTarifa(320000,null,12);
	throw new ExcepcionParametrosInvalidos();
	}
	
	@Test
	public void deberiaPasarEdadValida(){
		double res = calculoTarifa(130000,22,65);
		assertEquals(res,101666);
	}
	
}