package exam;

public class CardCompany { //카드회사는 오로지 한 개 회사의 카드번호를 고유적으로 중복없이 가지고 있어야 한다.
	private static CardCompany instance = new CardCompany();
	private CardCompany() { }
	public static CardCompany getInstance() {//CardCompany.getInstance()
		if(instance == null) instance = new CardCompany();
		return instance;
	}
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
