package exam;
//Q7. 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. <학번 생성하기>예제를 참고하여 
//카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성하되
//카드 회사 클래스(CardCompany) 를 싱글톤 패턴을 사용하여 구현해보세요
/*
카드(Card) 
	생성자 함수가 호출될 때마다 공유되는 카드 고유 번호(SerialNumber)를 증가시키고,
	카드 번호(Cardnumber)를 공유되는 카드 고유 번호로 대입시킴.
카드회사(Card Company)
	다른 카드 회사의 고유번호와 섞이지 않도록 싱글톤 형태로 객체가 생성될 수 있도록 하되,
	카드를 발급하게 되면, 카드번호가 자동으로 증가되어 발급되게 함.
*/
public class Exam7 {
	public static void main(String[] args) {
		CardCompany com = CardCompany.getInstance();
		CardCompany org = CardCompany.getInstance();
		
		Card c1 = com.createCard();
		Card c2 = com.createCard();
		Card c3 = com.createCard();
		Card c4 = org.createCard();
		Card c5 = org.createCard();
		
		System.out.println(c1.getCardNumber());
		System.out.println(c2.getCardNumber());
		System.out.println(c3.getCardNumber());
		System.out.println(c4.getCardNumber());
		System.out.println(c5.getCardNumber());
		
		SamsungCard sam = SamsungCard.getInstance();	//싱글톤
		
		Card c6 = sam.createCard();
		System.out.println(c6.getCardNumber());
	}
}
