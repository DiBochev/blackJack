package blackJack2;

public class Main {

	public static void main(String[] args) {
		HumanPlayer player = new HumanPlayer();
		GameManager manager = new GameManager(player);
		manager.StartGame();
	}

}
