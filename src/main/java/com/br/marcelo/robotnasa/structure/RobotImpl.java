package com.br.marcelo.robotnasa.structure;

import com.br.marcelo.robotnasa.actions.position.MyPositionPrintCommand;
import com.br.marcelo.robotnasa.structure.direction.Direction;
import com.br.marcelo.robotnasa.structure.position.Position;
import com.br.marcelo.robotnasa.structure.position.PositionImpl;
import com.br.marcelo.robotnasa.structure.terreno.Terreno;
import com.br.marcelo.robotnasa.structure.terreno.TerrenoImpl;

public class RobotImpl implements Robot {

	private Direction direction = Direction.NORTH;
	private Position position = new PositionImpl();
	private Terreno terreno = new TerrenoImpl();
	
	RobotImpl() {
		new MyPositionPrintCommand(this).execute();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public void newDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public Terreno getTerreno() {
		return terreno;
	}
	
	
}
