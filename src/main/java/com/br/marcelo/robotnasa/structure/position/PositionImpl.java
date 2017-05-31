package com.br.marcelo.robotnasa.structure.position;

public class PositionImpl implements Position {

	private static final int ZERO = 0;
	
	private int x = ZERO;
	private int y = ZERO;
	
	@Override
	public int getX() {
		return x;
	}
	
	@Override
	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void addX() {
		x++;
	}

	@Override
	public void decreaseY() {
		y--;
	}
	
	@Override
	public void addY() {
		y++;
	}

	@Override
	public void decreaseX() {
		x--;
	}
}
