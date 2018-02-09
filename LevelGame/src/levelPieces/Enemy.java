// Need to fill in move method - moves one toward the player each time
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
