package com.br.marcelo.robotnasa.actions.position;

import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.position.Position;

public class MyPositionImpl implements MyPosition {

	@Override
	public void calcPosition(Robot robot, MyPositionReturn myPositionReturn) {
		Position position = robot.getPosition();
		myPositionReturn.set(position);
		myPositionReturn.setDirection(robot.getDirection());
	}

}
