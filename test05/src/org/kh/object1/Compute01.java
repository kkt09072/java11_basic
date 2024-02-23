package org.kh.object1;

public class Compute01 {
	void fnc1() {	//반환(X), 매개변수(X)
		System.out.println("메소드(함수)1");
	}
	void fnc2(int a) {//반환(X), 매개변수(O)
		System.out.println(a+"를 입력하셨습니다.");
	}
	int fnc3() { //반환(O), 매개변수(X)
		return 1004;
	}
	String fnc4(int point) { //반환(O), 매개변수(O)
		if(point>=80) return "합격";
		else return "불합격";
	}
}
