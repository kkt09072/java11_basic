package exam04;

public class Amateur implements Gamer {
	final static int MAX_SPEED = 50;
	final static int MAX_HEIGHT = 2;
	
	@Override
	public void run(int speed) {
		if(speed>MAX_SPEED) System.out.println("아마추어의 속도는 "+MAX_SPEED+"를 넘을 수 없습니다.");
		else System.out.println("현재 속도는 "+speed+"입니다.");
	}

	@Override
	public void jump(int height) {
		if(height>MAX_HEIGHT) System.out.println("아마추어의 점프 높이는 "+MAX_HEIGHT+"까지 올라 갈 수 있습니다.");
		else System.out.println("현재 점프 높이는 "+height+"입니다.");
	}

	@Override
	public void turn(int angle) {
		System.out.println("아마추어 게이머가 "+angle+"로 회전합니다.");
	}

	@Override
	public void show(String name) {
		System.out.println(name+"아마추어 님이 게임중입니다.");
	}
}
