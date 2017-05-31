package com.br.marcelo.robotnasa.structure.terreno;

public class TerrenoImpl implements Terreno {

	private static final int MAX_POSITION = 5;
	private static final int INIT_POSITION = 0;
	
	private int x = MAX_POSITION;
	private int y = MAX_POSITION;

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getInitY() {
		return INIT_POSITION;
	}
	
	@Override
	public int getInitX() {
		return INIT_POSITION;
	}

}
