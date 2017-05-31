package com.br.marcelo.robotnasa.actions.receivecommand;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.actions.position.MyPositionReturn;
import com.br.marcelo.robotnasa.actions.receive.ReceiveCommand;
import com.br.marcelo.robotnasa.exception.InvalidCommandReceiveException;
import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class ReceiveCommandTest {

	@Test
	public void
	receiveCommandTest1(){
		
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MMRMMRMM";
		
		MyPositionReturn myPositionReturn = new MyPositionReturn();
		new ReceiveCommand(robot, commandReceive, myPositionReturn).execute();
		
		Assert.assertEquals(2, myPositionReturn.getPosition().getX());
		Assert.assertEquals(0, myPositionReturn.getPosition().getY());
		Assert.assertEquals(Direction.SOUTH, myPositionReturn.getDirection());
		Assert.assertEquals("(2, 0, S)", myPositionReturn.toString());
	}
	
	@Test
	public void
	receiveCommandTest2(){
		
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MML";
		
		MyPositionReturn myPositionReturn = new MyPositionReturn();
		
		new ReceiveCommand(robot, commandReceive, myPositionReturn).execute();
		
		Assert.assertEquals(0, myPositionReturn.getPosition().getX());
		Assert.assertEquals(2, myPositionReturn.getPosition().getY());
		Assert.assertEquals(Direction.WEST, myPositionReturn.getDirection());
		Assert.assertEquals("(0, 2, W)", myPositionReturn.toString());
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	receiveCommandTestInvalid1(){
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MMMMMMMMMMMMMMMMMMMMMMMM";
		new ReceiveCommand(robot, commandReceive, new MyPositionReturn()).execute();
	}
	
	@Test(expected=InvalidCommandReceiveException.class)
	public void
	receiveCommandTestInvalid2(){
		Robot robot = new RobotBuilder().build();
		String commandReceive = "AAA";
		new ReceiveCommand(robot, commandReceive, new MyPositionReturn()).execute();
	}
	
	@Test(expected=InvalidCommandReceiveException.class)
	public void
	receiveCommandTestInvalid3(){
		Robot robot = new RobotBuilder().build();
		String commandReceive = "USBFJKSDBFJKSDJKFJKSDF";
		new ReceiveCommand(robot, commandReceive, new MyPositionReturn()).execute();
	}
	
}
