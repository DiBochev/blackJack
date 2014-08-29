package blackJack2;


public class HummanPlayer extends Player{

	public String Command() {
		String input = System.console().readLine();
		return input;
	}

}
