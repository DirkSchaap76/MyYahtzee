package objects;

import program.MyUtil;
import program.MyUtil.*;

public class Game {
	public Player player;
	public Cup cup;
	public ScoreCard scoreCard;

	public void runGame() {
		System.out.println("Game is running");
		new Player("piet").getPlayerName();

		System.out.println(new Die().getDieRoll());

	}

}