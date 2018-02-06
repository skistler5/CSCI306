package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Obstacle extends GamePiece implements Drawable{

	public Obstacle(char symbol, int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.KILL;
		}
		return null;
	}

}
