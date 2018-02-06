package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.util.Random;


public class Rando extends GamePiece implements Drawable{

	public Rando(char symbol, int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		Random rand = new Random();
		int r = rand.nextInt(1);
		if(getLocation() == playerLocation) {
			if(r == 1) {
				return InteractionResult.HIT;
			}
			else {
				return InteractionResult.LIFE;
			}
		}		
		return null;
	}

}
