/**
 * LifeBox Class
 * Movement: random
 * Interaction: gives a life, decreases damagePoints
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
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

	/**
	 * LifeBox: Move Method
	 * Generates random position on game board
	 * If spot is taken, regenerates until spot is available
	 */
	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		int newPosition=Math.abs(random.nextInt()%21);
		while (pieces[newPosition]!=null){
			newPosition=Math.abs(random.nextInt()%21);
		}
		pieces[getLocation()]=null;
		setLocation(newPosition);
		pieces[newPosition]=this;

	}
}
