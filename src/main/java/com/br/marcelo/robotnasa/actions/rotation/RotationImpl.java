package com.br.marcelo.robotnasa.actions.rotation;

import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class RotationImpl implements Rotation {

	private static final int FIRST_POSITION = 0;
	private static final int LAST_POSITION = 3;
	private static final Direction[] DIRETIONS = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}; 
	
	@Override
	public void toTurn(Robot robot, Commands command) {
		int myDirection = discoveryMyDirection(robot);
		int newMyDirection = newDiretion(myDirection, command);
		robot.newDirection(DIRETIONS[newMyDirection]);
	}

	private int newDiretion(int myDirection, Commands command) {
		
		if(Commands.R == command && myDirection < LAST_POSITION){
			return myDirection +1;
		}else if(Commands.R == command && myDirection == LAST_POSITION){
			return FIRST_POSITION;
		}else if(Commands.L == command && myDirection > FIRST_POSITION){
			return myDirection -1;
		}else if(Commands.L == command && myDirection == FIRST_POSITION){
			return LAST_POSITION;
		}
		
		return myDirection;
	}

	private int discoveryMyDirection(Robot robot) {
		int pos = 0;
		for (Direction direction : DIRETIONS) {
			if( robot.getDirection() == direction ){
				return pos;
			}
			pos++;
		}
		return pos;
	}

}
