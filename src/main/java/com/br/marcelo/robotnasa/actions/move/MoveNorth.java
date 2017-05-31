package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;

class MoveNorth {

	MoveNorth(Robot robot) {
		
 		if( robot.getPosition().getY() == (robot.getTerreno().getY()-1) ){
			throw new MovingInvalidException();
		}
		
		robot.getPosition().addY();
	}

}
