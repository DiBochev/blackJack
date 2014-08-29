package blackJack2;

import java.util.ArrayList;

public abstract class Player implements IPlayer{
	private String name;
	private int value;
	private ArrayList<ICard> cards;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public ArrayList<ICard> getCards() {
		return this.cards;
	}

	public int getValue() {
		return this.value;
	}
	
	public Player(String name){
		this.name=name;
		this.value=0;
		this.cards= new ArrayList<ICard>();
	}
	
	public Player() {
		this("unnamed");
	}
	
	public void AppendCard(ICard card){
		this.cards.add(card);
	}
	
	public void ClearCards() {
		this.cards.clear();
	}

	public abstract String Command();
}
