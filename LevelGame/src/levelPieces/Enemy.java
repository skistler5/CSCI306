// Need to fill in move method - moves one toward the player each time
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Enemy extends GamePiece implements Drawable, Moveable {
	static char symbol = 'E';

	public Enemy(int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}
		return null;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		 
	}
	
	

}
