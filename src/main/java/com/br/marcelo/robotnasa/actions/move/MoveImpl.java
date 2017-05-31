package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class MoveImpl implements Move {

	@Override
	public void moving(Robot robot) {
		
		if( robot.getDirection() == Direction.NORTH ){
			new MoveNorth(robot);
		} else if( robot.getDirection() == Direction.EAST ){
			new MoveEast(robot);
		} else if( robot.getDirection() == Direction.SOUTH ){
			new MoveSouth(robot);
		} else if( robot.getDirection() == Direction.WEST ){
			new MoveWest(robot);
		}
		
	}

}
