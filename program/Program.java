package program;

public class Program {

	public static void main(String[] args) {

		// the following objects and their output are place holders and only used for
		// testing purposes
		Player playerOne = new Player();
		System.out.println(playerOne.playerName);

		Die dieOne = new Die();
		dieOne.dieRoll = 5;
		System.out.println(dieOne.dieRoll);

		Cup cupOne = new Cup();
		cupOne.die = new Die();
		System.out.println(cupOne.die.dieRoll);

		ScoreCard scoreOne = new ScoreCard();
		scoreOne.score = 5;
		System.out.println(scoreOne.score);

		Game gameOne = new Game();
		gameOne.player.playerName = "player one";
		gameOne.cup.die.dieRoll = 4;
		gameOne.scoreCard.score = 12;

		System.out.println(gameOne.player.playerName + gameOne.cup.die + gameOne.scoreCard.score);

	}

}

class Player {
	public String playerName;

}

class Die {
	public byte dieRoll;

}

class Cup {
	Die die;
}

class ScoreCard {
	int score;

}

class Game {
	Player player;
	Cup cup;
	ScoreCard scoreCard;

}