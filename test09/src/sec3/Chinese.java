package sec3;

public class Chinese implements Lunch {
	@Override
	public void eating(String menu) {
		System.out.println("중화요리 : "+menu+"를 먹습니다.");
	}
}
