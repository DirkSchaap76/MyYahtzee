package objects;

import program.MyUtil;

public class Die {
	private byte dieRoll;

	MyUtil utilities = new MyUtil();

	public byte getDieRoll() {
		System.out.println("You've rolled a: ");
		return dieRoll;
	}

	public void setDieRoll(byte dieRoll) {
		this.dieRoll = dieRoll;
	}

	public Die() {

		dieRoll = (byte) ((utilities.random.nextInt(6)) + 1);
		System.out.println(dieRoll);

	}

	public byte rollDie() {

		return new Die().getDieRoll();
	}

}