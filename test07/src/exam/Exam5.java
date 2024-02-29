package exam;

import java.util.ArrayList;

//Q5. 다음과 같이 Dog 클래스가 있다. Exam5 클래스에 객체수가 5인 ArrayList를 만든 후
//for 문과 향상된 for문에서 Dog 클래스의 show() 메서드를
//활용하여 ArrayList에 추가한 Dog 정보를 출력하세요.
public class Exam5 {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		Dog d1 = new Dog("눈탱이","치와와");
		Dog d2 = new Dog("누렁이","진돗개");
		Dog d3 = new Dog("초코","푸들");
		Dog d4 = new Dog("복슬이","삽살개");
		Dog d5 = new Dog("씩씩이","풍산개");
		
		dogList.add(d1);
		dogList.add(d2);
		dogList.add(d3);
		dogList.add(d4);
		dogList.add(d5);
		
		System.out.println("일반 for문 출력");
		for(int i=0;i<dogList.size();i++) {
			Dog d = dogList.get(i);
			System.out.println(d.show());
		}
		System.out.println("\n향상된 for문 출력");
		for(Dog d:dogList) {
			System.out.println(d.show());
		}
	}
}
