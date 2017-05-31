package com.br.marcelo.robotnasa.actions.move;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class MoveTest {

	@Test	
	public void
	movingToNorth(){
		Robot robot = new RobotBuilder().position(3, 3).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
		
		Assert.assertEquals(3, robot.getPosition().getX());
		Assert.assertEquals(4, robot.getPosition().getY());
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	movingToNorthWithException(){
		Robot robot = new RobotBuilder().position(4, 4).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	movingToEastWithException(){
		Robot robot = new RobotBuilder().direction(Direction.EAST).position(4, 3).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	movingToSouthWithException(){
		Robot robot = new RobotBuilder().direction(Direction.SOUTH).position(2, 0).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	movingToWestWithException(){
		Robot robot = new RobotBuilder().direction(Direction.WEST).position(0, 1).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
	}
	
	@Test	
	public void
	movingToEast(){
		Robot robot = new RobotBuilder().direction(Direction.EAST).position(3, 3).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
		
		Assert.assertEquals(4, robot.getPosition().getX());
		Assert.assertEquals(3, robot.getPosition().getY());
	}
	
	@Test	
	public void
	movingToSouth(){
		Robot robot = new RobotBuilder().direction(Direction.SOUTH).position(3, 3).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
		
		Assert.assertEquals(3, robot.getPosition().getX());
		Assert.assertEquals(2, robot.getPosition().getY());
	}
	
	@Test	
	public void
	movingToWest(){
		Robot robot = new RobotBuilder().direction(Direction.WEST).position(3, 3).build();
		
		Command command = new MoveCommand(robot);
		command.execute();
		
		Assert.assertEquals(2, robot.getPosition().getX());
		Assert.assertEquals(3, robot.getPosition().getY());
	}
	
	
}
