/**
 * Rando Class
 * Does not move.
 * Interaction: either hits or gives life, randomly determined
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
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

	/**
	 * Rando: Interact Method
	 * Player must take a chance.
	 * Randomly decides if it will help or hurt player.
	 */
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
