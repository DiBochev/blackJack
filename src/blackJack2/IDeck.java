package blackJack2;

public interface IDeck<T extends ICard> {
	void Shuffle();
	T DrowCard();
}
