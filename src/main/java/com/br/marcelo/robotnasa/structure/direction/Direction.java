package com.br.marcelo.robotnasa.structure.direction;

public enum Direction {

	NORTH("N"), 
	SOUTH("S"), 
	EAST("E"),
	WEST("W");
	
	private String value;
	
	private Direction(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
