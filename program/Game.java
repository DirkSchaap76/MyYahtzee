package program;

import objects.Player;

public class Game {

	public static void main(String[] args) {

		Player player = new Player("Player");
		System.out.println(player); // prints hashcode, don't know why. Goal: find out why!

	}

}
