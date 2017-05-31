package com.br.marcelo.robotnasa.actions.execcommand;

import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.actions.move.MoveCommand;
import com.br.marcelo.robotnasa.actions.rotation.RotationCommand;
import com.br.marcelo.robotnasa.structure.Robot;

class Brain {

	void process(Robot robot, Commands command) {
		
		if( command == Commands.L || command == Commands.R ){
			new RotationCommand(robot, command).execute();
		}else if( command == Commands.M  ){
			new MoveCommand(robot).execute();
		}
		
	}

}
