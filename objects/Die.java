package objects;

import java.util.Random;

public class Die {
	Random r = new Random();
	private byte dieRoll;

	public byte getDieRoll() {
		return dieRoll;
	}

	public void setDieRoll(byte dieRoll) {
		this.dieRoll = dieRoll;
	}

	public Die() {

		dieRoll = (byte) ((r.nextInt(6)) + 1);
	}

	public byte rollDie() {
		return new Die().getDieRoll();
	}

}