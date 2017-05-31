package com.br.marcelo.robotnasa.actions.myposition;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.move.MoveCommand;
import com.br.marcelo.robotnasa.actions.position.MyPositionCommand;
import com.br.marcelo.robotnasa.actions.position.MyPositionPrintCommand;
import com.br.marcelo.robotnasa.actions.position.MyPositionReturn;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class MyPositionTest {

	@Test
	public void 
	myPositionInit(){
		Robot robot = new RobotBuilder().build();
		MyPositionReturn myPositionReturn = new MyPositionReturn();
		
		Command command = new MyPositionCommand(robot, myPositionReturn);
		command.execute();
		
		new MyPositionPrintCommand(robot).execute();
		
		Assert.assertEquals(0, myPositionReturn.getPosition().getX());
		Assert.assertEquals(0, myPositionReturn.getPosition().getY());
	}
	
	@Test
	public void 
	myPositionAfterMove(){
		Robot robot = new RobotBuilder().build();
		
		robot.newDirection(Direction.EAST);
		new MoveCommand(robot).execute();
		
		robot.newDirection(Direction.NORTH);
		new MoveCommand(robot).execute();
		
		MyPositionReturn myPositionReturn = new MyPositionReturn();
		
		Command command = new MyPositionCommand(robot, myPositionReturn);
		command.execute();
		
		Assert.assertEquals(1, myPositionReturn.getPosition().getX());
		Assert.assertEquals(1, myPositionReturn.getPosition().getY());
		Assert.assertEquals(Direction.NORTH, robot.getDirection());
	}
	
}
