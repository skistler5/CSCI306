/**
 * NextLevelItem Class
 * Does not move.
 * Interaction: advances to next level with interaction
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class NextLevelItem extends GamePiece{
	static char symbol = '*';
			
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
