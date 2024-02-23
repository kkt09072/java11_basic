package org.kh.object1;

public class StudentEx1 {
	public static void main(String[] args) {
		Student cho = new Student();
		cho.resulting();
		cho.name = "강범준";
		cho.resulting();
		cho.kor = 80;
		cho.eng = 90;
		cho.mat = 85;
		cho.resulting();
	}
}
