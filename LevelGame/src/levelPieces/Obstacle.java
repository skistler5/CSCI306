/**
 * Obstacle Class
 * Does not move.
 * Interaction: kills immediately
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Obstacle extends GamePiece{
	static char symbol = 'O';

	public Obstacle(int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.KILL;
		}
		else {
			return null;
		}
	}
	
}
