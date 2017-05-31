package com.br.marcelo.robotnasa.actions.rotation;

import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.structure.Robot;

@FunctionalInterface
public interface Rotation {

	void toTurn(Robot robot, Commands command);

}
