package exam;

public class SamsungCard {
	private static SamsungCard instance = new SamsungCard();
	private SamsungCard() { }
	public static SamsungCard getInstance() {//SamsungCard.getInstance()
		if(instance == null) instance = new SamsungCard();
		return instance;
	}
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
