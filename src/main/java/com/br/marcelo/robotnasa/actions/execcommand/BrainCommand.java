package com.br.marcelo.robotnasa.actions.execcommand;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.structure.Robot;

public class BrainCommand implements Command {

	private Robot robot;
	private Commands command;
	private Brain brain;

	public BrainCommand(Robot robot, Commands command) {
		this.robot = robot;
		this.command = command;
		this.brain = new Brain();
	}
	
	@Override
	public void execute() {
		brain.process(robot, command);
	}

}
