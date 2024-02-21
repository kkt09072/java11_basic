package org.kh.app;
import java.util.Scanner;
//조건문 if~elseif(~else~) 
public class Condition3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100] :");
		int point = scan.nextInt();
		char result;
		/* 학점(result)은 점수(point)가 90~100이면 'A', 80~89이면, 'B',
 			70~79이면, 'C', 60~69이면, 'D', 60미만이면, 'F'
		 */
		if(point>=90) {
			result = 'A';
		} else if(point>=80) {
			result = 'B';
		} else if(point>=70) {
			result = 'C';
		} else if(point>=60) {
			result = 'D';
		} else {
			result = 'F';
		}
		/*
		비교횟수가 많아져 비효율적
		if(point>=90 && point<=100) result = 'A';
		if(point>=80 && point<=89) result = 'B';
		if(point>=70 && point<=79) result = 'C';
		if(point>=60 && point<=69) result = 'D';
		if(point>=0 && point<=59) result = 'F';
		*/
		System.out.printf("\n당신의 점수는 %d점 입니다.\n", point);
		System.out.println("당신의 학점은 "+result+"입니다.");
	}
}
