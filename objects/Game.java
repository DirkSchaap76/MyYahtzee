package objects;

import program.MyUtil;
import program.MyUtil.*;

public class Game {
	public Player player;
	public Cup cup;
	public ScoreCard scoreCard;

	public void runGame() {
		System.out.println("Game is running");
		Player playerOne = new Player("Klaas");
		Cup cupOne = new Cup();
		cupOne.cupMethod();
		ScoreCard score = new ScoreCard();
		score.keepScore();
		Die die = new Die();
		// die.getDieRoll();
		// die.rollDie();

	}

}