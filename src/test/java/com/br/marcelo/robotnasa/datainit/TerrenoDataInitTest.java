package com.br.marcelo.robotnasa.datainit;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.structure.terreno.Terreno;
import com.br.marcelo.robotnasa.structure.terreno.TerrenoImpl;


public class TerrenoDataInitTest {

	@Test
	public void
	terrenoDataInitTest(){
		Terreno terreno = new TerrenoImpl();
		Assert.assertEquals(5, terreno.getX());
		Assert.assertEquals(5, terreno.getY());
	}
	
}
