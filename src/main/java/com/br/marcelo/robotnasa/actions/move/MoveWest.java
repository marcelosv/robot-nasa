package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;

class MoveWest {

	MoveWest(Robot robot) {

		if (robot.getPosition().getX() == robot.getTerreno().getInitX() ) {
			throw new MovingInvalidException();
		}

		robot.getPosition().decreaseX();
	}

}
