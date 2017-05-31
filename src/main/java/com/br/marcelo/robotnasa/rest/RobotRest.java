package com.br.marcelo.robotnasa.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.marcelo.robotnasa.actions.position.MyPositionReturn;
import com.br.marcelo.robotnasa.actions.receive.ReceiveCommand;
import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.RobotBuilder;

@RestController
public class RobotRest {

	@RequestMapping(value="/rest/mars/{command}", method=RequestMethod.POST)
	@ResponseBody
    public String marks(@PathVariable(value="command", required=true) String commands) {
		Robot robot = new RobotBuilder().build();
		MyPositionReturn myPositionReturn = new MyPositionReturn();
		new ReceiveCommand(robot, commands, myPositionReturn).execute();
		return myPositionReturn.toString();
    }
	
}
