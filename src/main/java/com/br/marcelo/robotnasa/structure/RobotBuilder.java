package com.br.marcelo.robotnasa.structure;

import com.br.marcelo.robotnasa.structure.direction.Direction;

public class RobotBuilder {

	private Integer y;
	private Integer x;
	private Direction direct;

	public RobotBuilder position(Integer x, Integer y){
		this.x = x;
		this.y = y;
		return this;
	}
	
	public RobotBuilder direction(Direction direct){
		this.direct = direct;
		return this;
	}
	
	public Robot build(){
		Robot robot = new RobotImpl();
		
		if( direct != null ){
			robot.newDirection(direct);
		}
		
		if(x != null ){
			robot.getPosition().setX(x);
		}
		
		if(y != null ){
			robot.getPosition().setY(y);
		}
		
		return robot;
	}
}
