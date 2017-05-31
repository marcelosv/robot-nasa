package com.br.marcelo.robotnasa.actions.position;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import com.br.marcelo.robotnasa.structure.Robot;
import com.br.marcelo.robotnasa.structure.direction.Direction;

public class MyPositionPrint {

	private static final EnumMap<Direction, String> SIMBOLS = new EnumMap<>(Direction.class);
	private static final Map<Integer, Integer> POS_INVERT = new HashMap();
	
	static {
		SIMBOLS.put(Direction.NORTH, "^");
		SIMBOLS.put(Direction.EAST, ">");
		SIMBOLS.put(Direction.SOUTH, "$");
		SIMBOLS.put(Direction.WEST, "<");
		
		POS_INVERT.put(0, 4);
		POS_INVERT.put(1, 3);
		POS_INVERT.put(2, 2);
		POS_INVERT.put(3, 1);
		POS_INVERT.put(4, 0);
	}
	
	public void print(Robot robot) {

		MyPositionReturn myPositionReturn = new MyPositionReturn();
		new MyPositionCommand(robot, myPositionReturn).execute();

		for( int top=robot.getTerreno().getInitX(); top < robot.getTerreno().getX(); top++) {
			System.out.print("--");
		}
		
		System.out.println("");
		
		for( int line=robot.getTerreno().getInitX(); line < robot.getTerreno().getX(); line++) {
			
			for( int cols=robot.getTerreno().getInitY(); cols < robot.getTerreno().getY(); cols++) {
				
				int lineCorrectMyPositionY = POS_INVERT.get(myPositionReturn.getPosition().getY());
				
				if( cols == myPositionReturn.getPosition().getX() && line == lineCorrectMyPositionY ){
					System.out.print("|"+ SIMBOLS.get(robot.getDirection()) );
				}else{
					System.out.print("| ");
				}
			}
			
			System.out.print("| ");
			System.out.println("");
			
		}
		
		for( int botton=robot.getTerreno().getInitX(); botton < robot.getTerreno().getX(); botton++) {
			System.out.print("--");
		}
	}

}
