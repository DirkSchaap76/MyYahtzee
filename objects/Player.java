package objects;

public class Player {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player() {
		name = "player";
	}
	
	public Player(String nameIn) {
		this.name = nameIn;
	}

}
