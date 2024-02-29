package exam;
//Q1~Q3
//Q1. 클래스를 생성할 때 호출되는 ( )는 멤버 변수를 초기화하는 데 사용됩니다.
//Q2. 클래스를 생성하여 메모리에 있는 상태를 ( )라 하고, 멤버 변수를 다른 말로 ( )라고 합니다.
//Q3. ( )는 일반 함수에 객체 지향의 개념을 추가하여, 클래스 내부에 선언하고, 클래스 멤버 변수를 사용하여 클래스 기능을 구현합니다.
public class Exam0103 {
	public static void main(String[] args) {
		String a1 = "생성자 함수(Constructor)";
		String a21 = "인스턴스(Instance)";
		String a22 = "인스턴스 변수(Instance Variable)";
		String a3 = "메서드(Method)";
		
		String q1 = "Q1. 클래스를 생성할 때 호출되는 ("+a1+")는 멤버 변수를 초기화하는 데 사용됩니다.";
		String q2 = "Q2. 클래스를 생성하여 메모리에 있는 상태를 ("+a21+")라 하고, 멤버 변수를 다른 말로 ("+a22+")라고 합니다.";
		String q3 = "Q3. ("+a3+")는 일반 함수에 객체 지향의 개념을 추가하여, 클래스 내부에 선언하고, 클래스 멤버 변수를 사용하여 클래스 기능을 구현합니다.";
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
	}
}
