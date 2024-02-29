package exam;
//Q6. 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. <학번 생성하기>예제를 참고하여 
//카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성해 보세요
/*
 
카드(Card) 
	생성자 함수가 호출될 때마다 공유되는 카드 고유 번호(SerialNumber)를 증가시키고,
	카드 번호(Cardnumber)를 공유되는 카드 고유 번호로 대입시킴.
*/
public class Exam6 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println("카드 번호 : "+c1.getCardNumber());
		Card c2 = new Card();
		for(int i=1;i<=15;i++) {
			Card c = new Card();
		}
		Card c3 = new Card();
		System.out.println("카드 번호 : "+c3.getCardNumber());
	}
}
