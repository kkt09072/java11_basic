package sec1;
/*
[ public ] interface 인터페이스명 {...}

interface 인터페이스명 {
  // 상수
  타입 상수명 = 값;
  // 추상 메소드
  타입 메소드명(매개변수, ...);
  // 디폴트 메소드
  default 타입 메소드명(매개변수, ...) {...}
  // 정적 메소드
  static 타입 메소드명(매개변수) {...}
}

 */
public interface Calcurator {
	//인터페이스이므로 모든 메소드는 추상 메소드이므로 선언만 하여야 한다.
	double PI = 3.1415;		//인터페이스에 필드를 선언하면, 상수(final static)이 된다.
	int ERROR = -999999999;
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
}
