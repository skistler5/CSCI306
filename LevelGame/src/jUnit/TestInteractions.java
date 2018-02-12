package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Enemy;
import levelPieces.LifeBox;
import levelPieces.NextLevelItem;
import levelPieces.Obstacle;
import levelPieces.Rando;
import levelPieces.Script;

public class TestInteractions{

	
	@Test
	public void testEnemy() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Enemy enemy = new Enemy(10);
		gameBoard[10] = enemy;
		
		// Hit points if player on same space
		assertEquals(InteractionResult.HIT, enemy.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i = 0;i < 10;i++) {
			assertEquals(null, enemy.interact(gameBoard, i));
		}
		for (int i = 11;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, enemy.interact(gameBoard, i));
		}
	}
	
	@Test
	public void testLifeBox() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		LifeBox life = new LifeBox(10);
		gameBoard[10] = life;
		
		assertEquals(InteractionResult.LIFE, life.interact(gameBoard, 10));

		for (int i = 0;i < 10;i++) {
			assertEquals(null, life.interact(gameBoard, i));
		}
		for (int i = 11;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, life.interact(gameBoard, i));
		}
	}
	
	@Test
	public void testNextLevelItem() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		NextLevelItem next = new NextLevelItem(10);
		gameBoard[10] = next;
		
		assertEquals(InteractionResult.ADVANCE, next.interact(gameBoard, 10));

		for (int i = 0;i < 10;i++) {
			assertEquals(null, next.interact(gameBoard, i));
		}
		for (int i = 11;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, next.interact(gameBoard, i));
		}
	}
	
	@Test
	public void testObstacle() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Obstacle obstacle = new Obstacle(10);
		gameBoard[10] = obstacle;
		
		assertEquals(InteractionResult.KILL, obstacle.interact(gameBoard, 10));

		for (int i = 0;i < 10;i++) {
			assertEquals(null, obstacle.interact(gameBoard, i));
		}
		for (int i = 11;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, obstacle.interact(gameBoard, i));
		}
	}
	
	@Test
	public void testRando() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Rando rando = new Rando(10);
		gameBoard[10] = rando;
		
		InteractionResult interaction = rando.interact(gameBoard, 10);
		//accounts for both interactions - hit and life
		if (interaction == InteractionResult.LIFE) {
			assertEquals((InteractionResult.LIFE), interaction);
		}
		else {
			assertEquals((InteractionResult.HIT), interaction);
		}
		
		for (int i = 0;i < 10;i++) {
			assertEquals(null, rando.interact(gameBoard, i));
		}
		for (int i = 11;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, rando.interact(gameBoard, i));
		}
	}

	@Test
	public void testScript() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Script script = new Script(10);
		gameBoard[10] = script;
		
		assertEquals(InteractionResult.HINT, script.interact(gameBoard, 10));
		// must account for distance interactions
		for (int i = 0;i < 9;i++) {
			assertEquals(null, script.interact(gameBoard, i));
		}
		for (int i = 12;i < GameEngine.BOARD_SIZE;i++)	{
			assertEquals(null, script.interact(gameBoard, i));
		}
	}
}