package sec4;
/*
2. 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
주문 번호 : 201803120001
주문 아이디 : abc123
주문 날짜 : 2018년 3월 12일
주문자 이름 : 홍길순
주문 상품 번호 : PD0345-12
배송 주소 : 서울시 영등포구 여의도동 20번지 
*/
public class Exam2 {
	public static void main(String[] args) {
		PurChase pur = new PurChase("201803120001", "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		System.out.println(pur.toString());
	}
}
