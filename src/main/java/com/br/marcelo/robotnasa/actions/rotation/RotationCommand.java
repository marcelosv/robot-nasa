package com.br.marcelo.robotnasa.actions.rotation;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.commands.Commands;
import com.br.marcelo.robotnasa.structure.Robot;

public class RotationCommand implements Command {

	private Robot robot;
	private Commands command;
	private Rotation rotation;
	
	public RotationCommand(Robot robot, Commands command) {
		this.robot = robot;
		this.command = command;
		this.rotation = new RotationImpl();
	}
	
	@Override
	public void execute() {
		rotation.toTurn(robot, command);
	}

}
