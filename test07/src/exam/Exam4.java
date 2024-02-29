package exam;
//Q4. 다음과 같이 Dog 클래스가 있다. Exam4 클래스와 배열 길이가 5인 Dog[] 배열을 만든 후
//Dog 인스턴스를 5개 생성하여 배열에 추가하고, for 문과 향상된 for문에서 Dog 클래스의 show() 메서드를
//활용하여 배열에 추가한 Dog 정보를 출력하세요.
/*

public class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String show() {
		return name + ", " + type;
	}
}

*/
public class Exam4 {
	public static void main(String[] args) {
		//int[] arr = new int[5];
		Dog[] dog = new Dog[5];
		dog[0] = new Dog("눈탱이","치와와");
		dog[1] = new Dog("누렁이","진돗개");
		dog[2] = new Dog("초코","푸들");
		dog[3] = new Dog("복슬이","삽살개");
		dog[4] = new Dog("씩씩이","풍산개");
		System.out.println("일반 for문 출력");
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].show());
		}
		System.out.println("\n향상된 for문 출력");
		for(Dog d:dog) {
			System.out.println(d.show());
		}
	}
}
