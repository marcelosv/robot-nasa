package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.exception.MovingInvalidException;
import com.br.marcelo.robotnasa.structure.Robot;

class MoveEast {

	MoveEast(Robot robot) {

		if (robot.getPosition().getX() == (robot.getTerreno().getX()-1) ) {
			throw new MovingInvalidException();
		}

		robot.getPosition().addX();
	}

}
