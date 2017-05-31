package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.structure.Robot;

@FunctionalInterface
public interface Move {

	void moving(Robot robot);

}
