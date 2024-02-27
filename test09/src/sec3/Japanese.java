package sec3;

public class Japanese implements Lunch {
	@Override
	public void eating(String menu) {
		System.out.println("일식 : "+menu+"를 먹습니다.");
	}
}
