package com.br.marcelo.robotnasa.actions.position;

import com.br.marcelo.robotnasa.structure.direction.Direction;
import com.br.marcelo.robotnasa.structure.position.Position;

public class MyPositionReturn {

	private Position position;
	private Direction direction;
	
	
	public Direction getDirection() {
		return direction;
	}

	void setDirection(Direction direction) {
		this.direction = direction;
	}

	void set(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(position.getX());
		sb.append(", ");
		sb.append(position.getY());
		sb.append(", ");
		sb.append(direction.getValue());
		sb.append(")");
		
		return sb.toString();
	}
}
