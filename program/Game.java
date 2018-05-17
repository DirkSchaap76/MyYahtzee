package program;

import objects.Dice;
import objects.Player;

public class Game {

	public static void main(String[] args) {

		Player player = new Player("Player");
		System.out.println(player); // prints hashcode, don't know why. Goal: find out why!

		Dice die = new Dice();
		System.out.println(die); // figure out how to get a random number output printed

	}

}
