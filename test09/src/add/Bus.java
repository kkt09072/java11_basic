package add;

public class Bus {
	
	public final static int LIMIT = 2;	//상수
	public static int MAX = 100;	//값 변경하며, 공유 데이터
	public final void method1() { //final 메소드는 오버라이딩을 할 수 없음
		System.out.println("Bus Method1 메소드");
	}
	public void method2() {
		System.out.println("Bus Method2 메소드");
	}
}
