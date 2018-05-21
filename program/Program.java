package program;

import objects.Cup;
import objects.Die;
import objects.Game;
import objects.Player;
import objects.ScoreCard;

public class Program {

	public static void main(String[] args) {

		/*
		 * Die diceOne = new Die(); System.out.println("this is dieOne: " +
		 * diceOne.rollDie());
		 */
		
		Game gameOne = new Game();
		gameOne.runGame();
	}

}
