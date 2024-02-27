package sec1;

public class AnimalExam1 {
	public static void main(String[] args) {
		//부모 클래스로 부터 선언된 객체는 부모 또는 자식 생성자를 활용하여 객체를 생성할 수 있음.
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
		//자식 클래스로 부터 선언된 객체는 부모 또는 형제 생성자를 활용하여 객체를 생성할 수 없음.
		//Mammal m1 = new Animal();
		Mammal m2 = new Mammal();
		//Mammal m3 = new Birds();
		
		Animal a4;	//선언
		a4 = new Animal();	//Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Mammal();	//Mammal 객체로 형 변환
		//a4.setLegs(4);
		a4.setName("호랑이");
		System.out.println(a4.print());
		
		a4 = new Birds();	//Birds 객체로 형 변환
		//a4.setWings(0);
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		//메소드 오버라이딩 : 부모 클래스로 부터 상속 받은 메소드를 다르게 구현
		//그러므로, 부모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형 변환 할 수 있음 => 다형성
		//클래스 => 캡슐화, 정보 은닉, 재사용성, 다형성, 추상화
	}
}