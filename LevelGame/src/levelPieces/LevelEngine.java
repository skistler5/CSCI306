//Finish methods, instantiate pieces
package levelPieces;

import gameEngine.Moveable;
import gameEngine.Drawable;
import java.util.ArrayList;


public class LevelEngine {
	private int start = 0;
	Drawable[] drawPiece = new Drawable[21];
	ArrayList<Moveable> movePiece = new ArrayList<Moveable>();
	ArrayList<GamePiece> interacting = new ArrayList<GamePiece>();


	public int getPlayerStartLoc() {
		return start;
	}
	// LevelEngine needs to create the specified level

	public void createLevel(int levelNum){
		//create all null array/game board
		for(int i = 0; i < 21; i++) {
			drawPiece[i] = null;
		}
		//clear all pieces to start new level/game
		movePiece.clear();
		interacting.clear();
		if (levelNum == 1) {			
			//confusion - nothing
			Confusion useless = new Confusion(19);
			drawPiece[useless.getLocation()] = useless;

			//Enemy - draw, move
			Enemy evil = new Enemy(9);
			drawPiece[evil.getLocation()] = evil;
			movePiece.add(evil);
			interacting.add(evil);

			//LifeBox - draw, move
			LifeBox health = new LifeBox(5);
			drawPiece[health.getLocation()] = health;
			movePiece.add(health);
			interacting.add(health);

			//NextLevelItem - draw
			NextLevelItem progress = new NextLevelItem(20);
			drawPiece[progress.getLocation()] = progress;
			interacting.add(progress);

			//Obstacle - draw
			Obstacle block = new Obstacle(6);
			drawPiece[block.getLocation()] = block;
			interacting.add(block);
			
			//Obstacle2 - draw
			Obstacle block2 = new Obstacle(15);
			drawPiece[block2.getLocation()] = block2;
			interacting.add(block2);

			//Rando - draw
			Rando r = new Rando(13);
			drawPiece[r.getLocation()] = r;
			interacting.add(r);
			
			//Script - draw, move
			Script words = new Script(3);
			drawPiece[words.getLocation()] = words;
			interacting.add(words);

			start = 0;
		}
		else {
			//confusion - nothing
			Confusion useless = new Confusion(7);
			drawPiece[useless.getLocation()] = useless;

			//Enemy 1 - draw, move
			Enemy evil = new Enemy(14);
			drawPiece[evil.getLocation()] = evil;
			movePiece.add(evil);
			interacting.add(evil);
			
			//LifeBox - draw, move
			LifeBox health = new LifeBox(18);
			drawPiece[health.getLocation()] = health;
			movePiece.add(health);
			interacting.add(health);

			//NextLevelItem - draw
			NextLevelItem progress = new NextLevelItem(20);
			drawPiece[progress.getLocation()] = progress;
			interacting.add(progress);

			//Obstacle1 - draw
			Obstacle block = new Obstacle(1);
			drawPiece[block.getLocation()] = block;
			interacting.add(block);
			
			//Obstacle2 - draw
			Obstacle block2 = new Obstacle(19);
			drawPiece[block2.getLocation()] = block2;
			interacting.add(block2);
			
			//Obstacle3 - draw
			Obstacle block3 = new Obstacle(12);
			drawPiece[block3.getLocation()] = block3;
			interacting.add(block3);

			//Rando - draw
			Rando r = new Rando(4);
			drawPiece[r.getLocation()] = r;
			interacting.add(r);
			
			//Script - draw, move
			Script words = new Script(16);
			drawPiece[words.getLocation()] = words;
			interacting.add(words);

			start = 2;
		}
	}

	// request data structures from LevelEngine
	public Drawable[] getBoard(){	//or getPieces
		return drawPiece;
	}

	public ArrayList<Moveable> getMovingPieces(){
		return movePiece;
	}

	public ArrayList<GamePiece> getInteractingPieces(){
		return interacting;
	}

	// reset player statistics, starting location determined
	// by level engine
	public void resetLevel(int playerStartLocation){
		start = playerStartLocation;
	}

}