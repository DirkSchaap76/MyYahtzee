package program;

import objects.Dice;
import objects.Player;

/*
 * note to self: object.method();
 * or object.attribute;
 */

public class Game {

	public static void main(String[] args) {

		Player player = new Player("Player");
		System.out.println(player.getName());

		Dice die = new Dice();
		System.out.println(die.getDieRoll());
	}

}
