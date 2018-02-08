//Finish methods, instantiate pieces
package levelPieces;
import gameEngine.Moveable;
import java.util.ArrayList;
import gameEngine.Drawable;


public class LevelEngine {
	private int start = 0;
	private int levelNum;

	public int getPlayerStartLoc() {
		return start;
	}
	// LevelEngine needs to create the specified level

	public void createLevel(int levelNum){
		this.levelNum = levelNum;
	}
	
	// request data structures from LevelEngine
	public Drawable[] getBoard(){
		return d;
	}
	
	public ArrayList<Moveable> getMovingPieces(){
		
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		
	}
	
	// reset player statistics, starting location determined
	// by level engine
	public void resetLevel(int playerStartLocation){
		
	}

}