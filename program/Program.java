package program;

import objects.Cup;
import objects.Die;
import objects.Game;
import objects.Player;
import objects.ScoreCard;

public class Program {

	public static void main(String[] args) {

		testFunctionality();
	}

	static void testFunctionality() {
		Game gameOne = new Game();
		gameOne.runGame();

	}

}
