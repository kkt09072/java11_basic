package sec1;
//구현 클래스
public class Arithmatic extends Repeator {
	//추상 클래스로 부터 물려 받은 메소드는 구현 클래스에서 반드시 그 구현내용을 기술해야 한다.
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int su = 0;
		if(num1>num2) su = num1 / num2;
		else su = num2 / num1;
		return su;
	}

	@Override
	int power(int num1, int num2) {//2, 3
		int tmp = num1;
		for(int i=1;i<num2;i++) {//1 2 
			num1 = num1 * tmp;
		}
		return num1;
	}
	
	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}
}
