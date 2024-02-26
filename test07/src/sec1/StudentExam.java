package sec1;
import java.util.Scanner;
//객체 배열
//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여
//아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.
/*
	번호	국어	영어	수학	총점	평균		학점
	1	90	90	90	270	90.0	A
	2	80	70	60	210	70.0	C
	3	90	80	70	240	80.0	B
	4	60	90	70	220	73.3	C
	5	70	90	90	250	83.3	B
*/

public class StudentExam {
	public static void main(String[] args) { //int[] arr = {6,3,1,7,5,4,2};
		Student[] s = new Student[5]; //5명의 학생(Student) 배열 객체 선언
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			s[i] = new Student();	//개별 객체 생성
			s[i].setNo(i+1);		//번호 자동 부여
			System.out.print((i+1)+"번째 국어 : ");	//국어 점수 입력
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");	//영어 점수 입력
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");	//수학 점수 입력
			s[i].setMat(scn.nextInt());
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0;i<5;i++) {
			s[i].print();	//개별 객체 반복 출력
		}
	}
}