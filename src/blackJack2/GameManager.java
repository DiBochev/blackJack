package blackJack2;

import java.util.ArrayList;

public class GameManager {
	private IDeck<ICard> theDeck;
	private ArrayList<IPlayer> players;
	private Dealer dealer;
	private boolean isGameOver;
	
	public GameManager(ArrayList<IPlayer> players){
		this.players=players;
	}
	
	public GameManager(IPlayer player){
		this.players= new ArrayList<IPlayer>();
		this.players.add(player);
	}
	
	private IDeck<ICard> LoadFullDeck() {
		Deck<Card> deck= new Deck<Card>();
		for (CardSuit cardSuit : CardSuit.values()) {
			for (CardType cardType : CardType.values()) {
				deck.AddCard(new Card(cardSuit, cardType));
			}
		}
		deck.Shuffle();
		return deck;
	}
		
	public void StartGame(){
		this.isGameOver = false;
		this.dealer= new Dealer("Dealer");
		this.theDeck = LoadFullDeck();
		while(!isGameOver){
			for (IPlayer iPlayer : players) {
				iPlayer.AppendCard(theDeck.DrowCard());
				iPlayer.AppendCard(theDeck.DrowCard());
				// TODO: Do the logic
				if(iPlayer.Command().equals("c"));
				{
					iPlayer.AppendCard(theDeck.DrowCard());
				}
			}
		}
		ShowResult();
	}

	private void ShowResult() {
		// TODO Auto-generated method stub
		
	}


	
	
}
