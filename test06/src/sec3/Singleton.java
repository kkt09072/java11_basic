package sec3;
//싱글톤(Singleton) : 하나의 객체 생성만 허용하는 클래스
public class Singleton {
	private static Singleton instance;	//정적 객체 선언
	private Singleton() { }	//외부에서 생성할 수 없도록 private
	public static synchronized Singleton getInstance() { //getInstance() 호출시 생성
		if(instance == null) instance = new Singleton();
		return instance;
	}
}
