package objects;

import program.MyUtil;

public class Die {
	private byte dieRoll;

	MyUtil utilities = new MyUtil();

	public byte getDieRoll() {
		return dieRoll;
	}

	public void setDieRoll(byte dieRoll) {
		this.dieRoll = dieRoll;
	}

	public Die() {

		dieRoll = (byte) ((utilities.random.nextInt(6)) + 1);

	}

	public byte rollDie() {
		return new Die().getDieRoll();
	}

}