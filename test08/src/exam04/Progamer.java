package exam04;

public class Progamer implements Gamer {
	
	@Override
	public void run(int speed) {
		System.out.println("프로게이머의 속도는 "+speed+"입니다.");
	}

	@Override
	public void jump(int height) {
		System.out.println("프로게이머의 점프 높이는 "+height+"입니다.");
	}

	@Override
	public void turn(int angle) {
		System.out.println("프로게이머가 "+angle+"로 회전합니다.");
	}

	@Override
	public void show(String name) {
		System.out.println(name+"프로게이머 님이 게임중입니다.");
	}
}
