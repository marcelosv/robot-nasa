package com.br.marcelo.robotnasa.actions.receive;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.actions.position.MyPositionCommand;
import com.br.marcelo.robotnasa.actions.position.MyPositionReturn;
import com.br.marcelo.robotnasa.structure.Robot;

public class ReceiveCommand implements Command {

	private Robot robot;
	private String commandReceive;
	private Receive receive;
	private MyPositionReturn myPositionReturn;

	public ReceiveCommand(Robot robot, String commandReceive, MyPositionReturn myPositionReturn) {
		this.robot = robot;
		this.commandReceive = commandReceive;
		this.myPositionReturn = myPositionReturn;
		this.receive = new Receive();
	}

	@Override
	public void execute() {
		receive.process(robot, commandReceive);
		new MyPositionCommand(robot, myPositionReturn).execute();
	}

}
