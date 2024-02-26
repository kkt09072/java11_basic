package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam3 {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();	//목록
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			Student st = new Student();	//한 명의 학생 객체
			st.setNo(i+1);		//번호 자동 부여
			System.out.print((i+1)+"번째 국어 : ");	//국어 점수 입력
			st.setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");	//영어 점수 입력
			st.setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");	//수학 점수 입력
			st.setMat(scn.nextInt());
			s.add(st);
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(Student t:s) {
			t.print();
		}
	}
}