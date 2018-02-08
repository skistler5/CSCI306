// Need to fill in move method - random placement
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;

public class LifeBox extends GamePiece implements Drawable, Moveable{
	static char symbol = 'L';
	private Random rand = new Random();

	
	public LifeBox(int location){
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation){
		if(getLocation() == playerLocation){
			return InteractionResult.LIFE;
		}
		return null;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		
	}
}
