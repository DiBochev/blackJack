package blackJack2;

import java.util.ArrayList;

public interface IPlayer {
	String getName();
	void setName(String name);
	ArrayList<ICard> getCards();
	int getValue();
	void AppendCard(ICard card);
	void ClearCards();
	String Command();
}
