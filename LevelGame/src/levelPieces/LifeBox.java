/**
 * LifeBox Class
 * Movement: random
 * Interaction: gives a life, decreases damagePoints
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
// Need to fill in move method - random placement
package levelPieces;

import gameEngine.Drawable;

import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;

public class LifeBox extends GamePiece implements Moveable{
	static char symbol = 'L';
	private Random random = new Random(5);

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

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		int newPosition=Math.abs(random.nextInt()%21);
		while (pieces[newPosition]!=null){
			newPosition=Math.abs(random.nextInt()%21);
		}
		pieces[getLocation()]=null;
		setLocation(newPosition);
		pieces[newPosition]=this;
		/*
	}
		int r = (int)(Math.random() * 15);	//random spot on array - idk if this is how you do random
		while(gameBoard[r] != null  && r != playerLocation){
			r = (int)(Math.random() * 15);
		}
		gameBoard[getLocation()] = null;
		setLocation(r);
		gameBoard[getLocation()] = this;
		 */
	}
}
