package com.br.marcelo.robotnasa.actions.position;

import com.br.marcelo.robotnasa.structure.Robot;

@FunctionalInterface
public interface MyPosition {

	void calcPosition(Robot robot, MyPositionReturn myPositionReturn);

}
