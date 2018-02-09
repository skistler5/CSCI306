//movement or lack of movement has not been determined
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.util.Random;

public class Rando extends GamePiece{
	static char symbol = '!';
	private Random random;
			
	public Rando(int location) {
		super(symbol, location);
		random = new Random();
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		boolean hitOrLife = random.nextBoolean();
		if(getLocation() == playerLocation) {
			if(hitOrLife) {
				return InteractionResult.HIT;
			}
			else {
				return InteractionResult.LIFE;
			}
		}		
		return null;
	}
	
}
