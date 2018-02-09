package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Script extends GamePiece{
	static char symbol = '^';
	
	public Script(int location){
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation){
		if(getLocation() == playerLocation || getLocation()==playerLocation-1 || getLocation() == playerLocation+1){
			return InteractionResult.HINT;
		}
		return null;
	}

}