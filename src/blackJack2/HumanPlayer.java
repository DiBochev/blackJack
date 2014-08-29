package blackJack2;


public class HumanPlayer extends Player{

	public String Command() {
		String input = System.console().readLine();
		return input;
	}

}
