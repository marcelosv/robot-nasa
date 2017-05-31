package com.br.marcelo.robotnasa.actions.position;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.structure.Robot;

public class MyPositionCommand implements Command{

	private Robot robot;
	private MyPosition myPosition;
	private MyPositionReturn myPositionReturn;

	public MyPositionCommand(Robot robot, MyPositionReturn myPositionReturn ){
		this.robot = robot;
		this.myPositionReturn = myPositionReturn;
		this.myPosition = new MyPositionImpl();
	}
	
	@Override
	public void execute() {
		myPosition.calcPosition(robot, myPositionReturn);
	}

}
