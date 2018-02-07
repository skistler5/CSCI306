package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class NextLevelItem extends GamePiece implements Drawable{
	static char symbol = 'N';
			
	public NextLevelItem(int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.ADVANCE;
		}
		return null;
	}
	

}
