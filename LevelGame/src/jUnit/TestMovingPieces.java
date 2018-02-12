//Authors: Sarah McCabe, Stephen Kistler
//Due: 2/12/18

package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.LifeBox;
import gameEngine.Player;
import levelPieces.Obstacle;
import levelPieces.Enemy;
import levelPieces.LevelEngine;

public class TestMovingPieces {
	@Test
	public void testRandomMovement(){
		int count = 0;
		Drawable[] pieces = new Drawable[GameEngine.BOARD_SIZE];
		LevelEngine levels = new LevelEngine();
		
		//set some other pieces onto the board
		for(int i = 8; i < 14; i++){
			pieces[i] = new Obstacle(i);
		}
		
		//lifebox obj set to place 17
		LifeBox lb = new LifeBox(17);
		
		Drawable [] returnB = new Drawable[GameEngine.BOARD_SIZE];
		returnB = levels.getBoard();
		for(int i = 0; i < 21; i++){
			lb.move(pieces, i);
			if(pieces[i] != returnB[i]) count++;
			System.out.println(pieces[i] + "= " + returnB[i]);
			
		}
		
		assert(count > 1);
	}
	
	@Test
	public void testEnemyMovement(){
		int count = 0;
		Drawable[] pieces = new Drawable[GameEngine.BOARD_SIZE];
		LevelEngine levels = new LevelEngine();
		Player player = new Player(10);

		//test move toward player when player is less than
		Enemy enemy = new Enemy(15);
		enemy.move(pieces, player.getLocation());
		if(enemy.getLocation() == 14) {
			count ++;
		}
		
		//player is greater then
		Enemy enemy2 = new Enemy(4);
		enemy2.move(pieces, player.getLocation());
		if(enemy2.getLocation() == 5) {
			count ++;
		}

		assert(count == 2);
	}
}
