package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;

class MoveSouth {

	MoveSouth(Robot robot) {

		if( robot.getPosition().getY() == (robot.getTerreno().getInitY()) ){
			throw new MovingInvalidException();
		}
		
		robot.getPosition().decreaseY();
	}

}
