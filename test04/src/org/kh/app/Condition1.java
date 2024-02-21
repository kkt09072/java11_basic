package org.kh.app;
//조건문 if : if(조건식) { 처리할문장;  } //처리할 문장이 한 줄일 경우 {}는 생략 가능
public class Condition1 {
	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		//판정(pass)은 점수(point)가 70 점 이상이면, "합격", 아니면 "불합격"
		if (point>=70) pass = "합격";
		/*
		if(point>=70) {
			pass = "합격";
		}
		if(point>=70) { pass = "합격"; }  */
		System.out.printf("\n당신의 점수는 %d이며, 판정은 %s입니다.", point, pass);
		String pass2 = (point>=70) ? "합격" : "불합격"; 
	}
}
