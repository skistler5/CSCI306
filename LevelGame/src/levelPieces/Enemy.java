/**
 * Enemy Class
 * Movement: Moves one space towards the player each time
 * Interaction: hits, adds a damagePoints
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Enemy extends GamePiece implements Moveable {
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

	/**
	 * Enemy: Move Method
	 * Moves one spot closer to player each time
	 * If spot is taken, jumps until next available spot
	 */
	//moves enemy back and forth one place - should move one closer to player location ***FIX***
	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		int counter = 1;
		if(playerLocation <= getLocation()) {
			while(pieces[getLocation()-counter]!=null) {
				counter++;
			}
			setLocation(getLocation()-counter);
			pieces[getLocation()+counter]=null;
			pieces[getLocation()]=this;
		}
		else if(playerLocation > getLocation()){
			while(pieces[getLocation()+counter]!=null) {
				counter++;
			}
			setLocation(getLocation()+counter);
			pieces[getLocation()-counter]=null;
			pieces[getLocation()]=this;
		}
	}

}
