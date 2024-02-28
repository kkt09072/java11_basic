package exam01;

import java.util.Scanner;

/*
1. 칼로리 계산하는 프로그램을 작성하시오. 
	아래의 지시사항대로 단백질, 탄수화물, 지방의 값을 키보드로 입력받아 칼로리를 계산하여 출력하는 프로그램을 작성하라.
	해당 패키지 : exam01
	실행 클래스명(main 함수 포함) : CalorieExam
	변수명 : 칼로리(calorie), 단백질(protein), 탄수화물(carbohydrate), 지방(fat)
	계산식 : 칼로리 = 단백질x4+탄수화물x4+지방x9
 */
public class CalorieExam {
	public static void main(String[] args) {
		int calorie, protein, carbohydrate, fat;
		Scanner sc = new Scanner(System.in);
		System.out.print("단백질 : ");
		protein = sc.nextInt();
		System.out.print("탄수화물 : ");
		carbohydrate = sc.nextInt();
		System.out.print("지방 : ");
		fat = sc.nextInt();
		calorie = protein*4+carbohydrate*4+fat*9;
		System.out.println("\n칼로리 : "+calorie);
	}
}
