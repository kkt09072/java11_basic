package org.kh.object1;
//메서드(Method) : 정의 -> 호출
//특정 클래스(객체)에 속하므로 호출시 "객체.메소드명()"으로 호출  
public class ComputeEx1 {
	public static void main(String[] args) {
		Compute01 comp1 = new Compute01();
		comp1.fnc1();	//메소드 호출
		comp1.fnc2(100);
		int a = comp1.fnc3();
		System.out.println(comp1.fnc3());
		System.out.println(a);
		String pass = comp1.fnc4(75);
		System.out.println(pass);
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이 : "+fnc4(25));
	}
	//함수(Function) : 정의 호출
	public static void fnc1() {
		System.out.println("반환(X),매개 변수(x)");
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 : "+a);
	}
	public static int fnc3() {
		return 500;
	}
	public static double fnc4(int radius) {
		return radius*radius*3.1415f;
	}
}
