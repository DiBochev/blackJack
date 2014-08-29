package blackJack2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck<T extends ICard> implements IDeck<ICard>{
	private ArrayList<T> cards;
	private int count;
	
	public int getCount() {
		return count;
	}

	public Deck(ArrayList<T> cards) {
		this.cards = cards;
		this.count= cards.size();
		this.Shuffle();
	}
	
	public Deck() {
		cards = new ArrayList<T>();
	}
	
	public void FillDeck(ArrayList<T> cards) {
		this.cards=cards;
		this.Shuffle();
		this.count=cards.size();
	}
	
	public void Shuffle(){
		Collections.shuffle(this.cards);
	}
	
	public T DrowCard(){
		T card= cards.get(0);
		cards.remove(0);
		count--;
		return card;
	}
	
	public void AddCard(T card){
		cards.add(card);
	}
}
