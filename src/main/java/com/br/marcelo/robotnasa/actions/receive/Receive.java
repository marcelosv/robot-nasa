package com.br.marcelo.robotnasa.actions.receive;

import java.util.Arrays;

import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.actions.execcommand.BrainCommand;
import com.br.marcelo.robotnasa.exception.InvalidCommandReceiveException;
import com.br.marcelo.robotnasa.structure.Robot;

class Receive {

	void process(Robot robot, String commandReceive) {
		Commands[] commandConverted = new Commands[commandReceive.length()];
		for(int loop=0; loop < commandReceive.length(); loop++){
			Character item = commandReceive.charAt(loop);
		
			boolean result = Arrays.asList(Commands.values()).toString().indexOf(item) >= 0;
			if (!result ){
				throw new InvalidCommandReceiveException();
			}
			
			commandConverted[loop] = Commands.valueOf(item.toString());
		}
		
		for (Commands command : commandConverted) {
			new BrainCommand(robot, command).execute();
		}
	}

}
