package sec1;
//추상 메소드 : 선언만 하고, 구현 내용을 기술하지 않는다.
public interface Computer { //인터페이스(interface) : 모든 메소드는 추상 메소드 이다.
	//구현 클래스에서 반드시 인터페이스에서 정의한 매개변수와 반환타입대로 구현을 해야 한다.
	void display();
	void typing();
	void power(boolean sw);
}
