package objects;

import java.util.Random;

public class Dice {
	public int dieRoll;

	Random random = new Random();

	public Dice() {

	}

	public Dice(Random random) {
		this.dieRoll = (random.nextInt(6) + 1);
	}

}
