package sec1;

public class Desktop implements Computer{

	@Override
	public void display() {
		System.out.println("데스크탑의 모니터 기본 해상도 : 1920 x 1080");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑은 별도의 마련된 키보드를 타이핑합니다.");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("데스크탑의 전원을 켭니다.");
		else System.out.println("데스크탑의 전원을 끔니다.");
	}
	//오버로딩된 power 메소드
	public void power(String name, boolean sw) {
		
	}
}
