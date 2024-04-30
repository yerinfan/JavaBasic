package chap06;

public class Smartphone extends Telephone {

	private String game;
	
	public Smartphone(String owner, String game) {
		super(owner, "when");
		this.game = game;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public void playGame() {
		System.out.println(owner + "가 " + game + "을 하는 중이다.");
	}
}
