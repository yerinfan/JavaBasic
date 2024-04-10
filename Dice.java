package chap04;

import java.util.Random;

public class Dice {
	
	int face;
	
	public int Roll() {
		Random r = new Random();
		face = 1 + r.nextInt(6);
		
		return face;
	}	
	
}
