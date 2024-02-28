package exam04;
/*
4. 게이머(Gamer) 인터페이스와 여러 클래스
	해당 패키지 : exam04
	실행 클래스명(main 함수 포함) : GamerExam
		아래 작성된 Gamer 인터페이스로 추상체를 선언하고, 각 Amateur, Progamer 클래스로 형 변환하여 
		각 메소드를 모두 구현할 수 있는 예시를 작성하라.
	인터페이스명 : Gamer
		추상 메소드 : void run(int speed), void jump(int height), void turn(int angle), void show(String name)
	클래스명 : Amateur(Gamer 인터페이스를 구현하는 클래스)
		멤버 필드 : 계정(id), 속도(speed), 높이(height), 각도(angle)
		상수 : MAX_SPEED = 50, MAX_HEIGHT = 2
		메소드 구현 내용
			run(int speed) : 
				매개 변수로 입력받은 speed가 최고 속도(MAX_SPEED)를 초과할 경우
					"아마추어의 속도는 "+MAX_SPEED+"를 넘을 수 없습니다." 출력
				매개 변수로 입력받은 speed가 최고 속도(MAX_SPEED) 이하인 경우
					"현재 속도는 "+speed+"입니다." 출력
			jump(int height) : 
				매개 변수로 입력받은 height가 최고 높이(MAX_HEIGHT)를 초과할 경우
				"아마추어의 점프 높이는 "+MAX_HEIGHT+"까지 올라 갈 수 있습니다." 출력
				매개 변수로 입력받은 height가 최고 높이(MAX_HEIGHT) 이하인 경우
				"현재 점프 높이는 "+height+"입니다." 출력
			turn(int angle) : "아마추어 게이머가 "+angle+"로 회전합니다." 출력
			show() : id+"아마추어 님이 게임중입니다." 출력
	클래스명 : Progamer(Gamer 인터페이스를 구현하는 클래스)
		멤버 필드 : 계정(id), 속도(speed), 높이(height), 각도(angle)
		메소드 구현 내용
			run(int speed) : "프로게이머의 속도는 "+speed+"입니다." 출력
			jump(int height) : "프로게이머의 점프 높이는 "+height+"입니다." 출력
			turn(int angle) : "프로게이머가 "+angle+"로 회전합니다." 출력
			show() : id+"프로게이머 님이 게임중입니다." 출력 
 */
public class GamerExam {
	public static void main(String[] args) {
		Gamer gamer;
		gamer = new Amateur();
		gamer.run(50);
		gamer.jump(1);
		gamer.turn(2);
		gamer.show("권민지");
		System.out.println();
		gamer = new Progamer();
		gamer.run(200);
		gamer.jump(3);
		gamer.turn(6);
		gamer.show("김기태");
	}
}
