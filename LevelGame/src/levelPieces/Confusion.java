/**
 * Confusion Class 
 * Drawable piece with essentially no use (no interaction or movement)
 * 
 * @author Sarah McCabe
 * @author Stephen Kistler
 * 
 */
package levelPieces;

import gameEngine.Drawable;

public class Confusion implements Drawable{
	static char symbol = '?';
	private int location;

	public Confusion (int location) {
		super();
		this.location = location;
	}
	
	@Override
	public void draw() {
		System.out.println(symbol);
	}

	public int getLocation() {
		return location;
	}

}
