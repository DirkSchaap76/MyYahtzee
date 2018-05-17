package objects;

import java.util.Random;

public class Dice {
	private int dieRoll;
	
	

	public int getDieRoll() {
		return dieRoll;
	}

	public void setDieRoll(int dieRoll) {
		this.dieRoll = dieRoll;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	Random random = new Random();

	public Dice() {

	}

	public Dice(Random random) {
		this.dieRoll = (random.nextInt(6) + 1);
	}

}
