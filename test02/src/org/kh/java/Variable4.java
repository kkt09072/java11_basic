package org.kh.java;

public class Variable4 {
	public static void main(String[] args) {
		String name = "김기태";
		short age = 44;
		float height = 173.6f;
		double weight = 71.9;
		char init = 'k';
		
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+init);
		/* 이스케이프 문자
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 \" : "를 출력
		 \' : '를 출력
		 */
	}
}
