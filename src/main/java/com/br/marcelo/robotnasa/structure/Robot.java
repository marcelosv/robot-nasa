package com.br.marcelo.robotnasa.structure;

import com.br.marcelo.robotnasa.structure.direction.Direction;
import com.br.marcelo.robotnasa.structure.position.Position;
import com.br.marcelo.robotnasa.structure.terreno.Terreno;

public interface Robot {

	Direction getDirection();

	void newDirection(Direction direction);

	Position getPosition();

	Terreno getTerreno();

	
}
