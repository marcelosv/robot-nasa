package com.br.marcelo.robotnasa.datainit;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.structure.position.Position;
import com.br.marcelo.robotnasa.structure.position.PositionImpl;


public class PositionDataInitTest {

	@Test
	public void
	positionDataInitTest(){
		Position position = new PositionImpl();
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals(0, position.getY());
	}
	
	@Test
	public void
	positionDataChangeTest(){
		Position position = new PositionImpl();
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals(0, position.getY());
		
		position.setX(1);
		position.setY(2);
		
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(2, position.getY());
	}
}
