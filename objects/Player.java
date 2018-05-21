package objects;

import java.util.Scanner;

public class Player {
	private String playerName;
	Scanner scanner = new Scanner(System.in);

	public Player() {
		System.out.println("player one.");
	}

	public Player(String nameIn) {
		this.playerName = nameIn;
		System.out.println(nameIn);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void playerBuilder() {
		System.out.println("Enter player name: ");
		new Player(scanner.nextLine());

	}

}