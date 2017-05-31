package com.br.marcelo.robotnasa.actions.position;

import com.br.marcelo.robotnasa.actions.Command;
import com.br.marcelo.robotnasa.structure.Robot;

public class MyPositionPrintCommand implements Command {

	private Robot robot;
	private MyPositionPrint myPositionPrint;
	
	public MyPositionPrintCommand(Robot robot) {
		this.robot = robot;
		this.myPositionPrint = new MyPositionPrint();
	}
	
	@Override
	public void execute() {
		myPositionPrint.print(robot);		
	}

}
