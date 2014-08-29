package blackJack2;

public class Card implements ICard {
	private CardSuit suit;
	private CardType type;
	private int points;
	
	public CardType getType() {
		return type;
	}
	public CardSuit getSuit() {
		return suit;
	}
	public int getPoints() {
		return points;
	}
	public Card(CardSuit suit, CardType type, int points) {
		this.suit = suit;
		this.type= type;
		this.points=points;
	}
	public Card(CardSuit suit, CardType type) {
		this.suit = suit;
		this.type=type;
		switch (type){
		case two:
			this.points = 2;
			break;
		case three:
			this.points = 3;
			break;
		case four:
			this.points = 4;
			break;
		case five:
			this.points = 5;
			break;
		case six:
			this.points = 6;
			break;
		case seven:
			this.points = 7;
			break;
		case eight:
			this.points = 8;
			break;
		case nine:
			this.points = 9;
			break;
		case ten:
		case King:
		case Queen:
		case Jack:
			this.points=10;
			break;
		case Ace:
			this.points=11;
			break;
		default:
			this.points=0;
		}
	}
}
