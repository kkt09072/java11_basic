package sec1;

public interface Calcurator {
	//인터페이스이므로 모든 메소드는 추상 메소드이므로 선언만 하여야 한다.
	double PI = 3.1415;		//인터페이스에 필드를 선언하면, 상수(final static)이 된다.
	int ERROR = -999999999;
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
}
