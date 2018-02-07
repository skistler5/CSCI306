package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Enemy extends GamePiece implements Drawable {
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
	

}
