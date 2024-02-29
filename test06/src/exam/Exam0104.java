package exam;
//Q1~Q4
//Q1. 클래스 내부에서 자신의 주소를 가르키는 예약어를 ( )라고 합니다.
//Q2. 클래스에 여러 생성자가 오버로드 되어 있을 경우에 하나의 생성자에서 다른 생성자를 호출할 때 ( )를 사용합니다.
//Q3. 클래스 내부에 선언하는 static 변수는 생성되는 인스턴스마다 만들어지는 것이 아닌 여러 인스턴스가 공유하는 변수입니다. 따라서, 클래스에 기반한 유일한 변수라는 의미로 ( )라고도 합니다.
//Q4. 지역 변수는 함수나 메서드 내부에서만 사용할 수 있고 ( ) 메모리에 생성됩니다. 멤버 변수 중 static 예약어를 사용하는 static ( )메모리에 생성됩니다.
public class Exam0104 {
	public static void main(String[] args) {
		String a1 = "this";
		String a2 = "this()";
		String a3 = "클래스 변수";		//공유 변수
		String a41 = "스택(Stack)";
		String a42 = "데이터 영역(Data Area)";
				
		String q1 = "Q1. 클래스 내부에서 자신의 주소를 가르키는 예약어를 ("+a1+")라고 합니다.";
		String q2 = "Q2. 클래스에 여러 생성자가 오버로드 되어 있을 경우에 하나의 생성자에서 다른 생성자를 호출할 때 ("+a2+")를 사용합니다.";
		String q3 = "Q3. 클래스 내부에 선언하는 static 변수는 생성되는 인스턴스마다 만들어지는 것이 아닌 여러 인스턴스가 공유하는 변수입니다. 따라서, 클래스에 기반한 유일한 변수라는 의미로 ("+a3+")라고도 합니다.";
		String q4 = "Q4. 지역 변수는 함수나 메서드 내부에서만 사용할 수 있고 ("+a41+") 메모리에 생성됩니다. 멤버 변수 중 static 예약어를 사용하는 static ("+a42+")메모리에 생성됩니다.";
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		
	}
}
