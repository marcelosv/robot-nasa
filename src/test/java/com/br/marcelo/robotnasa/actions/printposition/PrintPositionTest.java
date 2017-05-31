package com.br.marcelo.robotnasa.actions.printposition;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.actions.position.MyPositionPrint;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;

public class PrintPositionTest {

	@Test
	public void 
	myPositionInit(){
		try{
			Robot robot = new RobotBuilder().build();
			MyPositionPrint myPositionPrint = new MyPositionPrint(); 
			myPositionPrint.print(robot);
		}catch(Exception ex){
			Assert.fail();
		}
	}
	
	
}
