package com.br.marcelo.robotnasa.actions.rotation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class RotationTest {

	@Test
	public void
	rotationNorthToEast(){
		Robot robot = new RobotBuilder().build();
		Command command = new RotationCommand(robot, Commands.R);
		command.execute();
		Assert.assertEquals(Direction.EAST, robot.getDirection());
	}
	
	@Test
	public void
	rotationEastToSouth(){
		Robot robot = new RobotBuilder().direction(Direction.EAST).build();
		
		Command command = new RotationCommand(robot, Commands.R);
		command.execute();
		Assert.assertEquals(Direction.SOUTH, robot.getDirection());
	}
	
	@Test
	public void
	rotationSouthToWest(){
		Robot robot = new RobotBuilder().direction(Direction.SOUTH).build();
		
		Command command = new RotationCommand(robot, Commands.R);
		command.execute();
		Assert.assertEquals(Direction.WEST, robot.getDirection());
	}
	
	@Test
	public void
	rotationWestToNorth(){
		Robot robot = new RobotBuilder().direction(Direction.WEST).build();
		
		Command command = new RotationCommand(robot, Commands.R);
		command.execute();
		Assert.assertEquals(Direction.NORTH, robot.getDirection());
	}
	
	@Test
	public void
	rotationNorthToWest(){
		Robot robot = new RobotBuilder().build();
		Command command = new RotationCommand(robot, Commands.L);
		command.execute();
		Assert.assertEquals(Direction.WEST, robot.getDirection());
	}
	
	@Test
	public void
	rotationWestToSouth(){
		Robot robot = new RobotBuilder().direction(Direction.WEST).build();

		Command command = new RotationCommand(robot, Commands.L);
		command.execute();
		Assert.assertEquals(Direction.SOUTH, robot.getDirection());
	}
	
	@Test
	public void
	rotationSouthToEast(){
		Robot robot = new RobotBuilder().direction(Direction.SOUTH).build();
		
		Command command = new RotationCommand(robot, Commands.L);
		command.execute();
		Assert.assertEquals(Direction.EAST, robot.getDirection());
	}
	
	@Test
	public void
	rotationEastToNorth(){
		Robot robot = new RobotBuilder().direction(Direction.EAST).build();

		Command command = new RotationCommand(robot, Commands.L);
		command.execute();
		Assert.assertEquals(Direction.NORTH, robot.getDirection());
	}
	
	@Test
	public void
	rotationMultiple(){
		Robot robot = new RobotBuilder().build();
		
		List<Command> lCommands = new ArrayList();
		lCommands.add(new RotationCommand(robot, Commands.R));
		lCommands.add(new RotationCommand(robot, Commands.R));
		lCommands.add(new RotationCommand(robot, Commands.R));
		lCommands.add(new RotationCommand(robot, Commands.L));
		lCommands.add(new RotationCommand(robot, Commands.R));
		
		for (Command item : lCommands) {
			item.execute();	
		}
		
		Assert.assertEquals(Direction.WEST, robot.getDirection());
	}
	
}
