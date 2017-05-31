package com.br.marcelo.robotnasa.actions.move;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.position.MyPositionPrintCommand;
import com.br.marcelo.robotnasa.structure.Robot;

public class MoveCommand implements Command {

	private Robot robot;
	private Move move;
	
	public MoveCommand(Robot robot) {
		this.robot = robot;
		this.move = new MoveImpl();
	}
	
	@Override
	public void execute() {
		move.moving(robot);
		new MyPositionPrintCommand(robot).execute();
	}

}
