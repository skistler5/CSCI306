package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class LifeBox extends GamePiece implements Drawable{
	static char symbol = 'L';
	
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
}
