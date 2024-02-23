package org.kh.object1;
/*
학생(Student) 클래스를 작성하되, 해당 학생의 이름(name), 점수(kor, eng, mat)과 총점(tot())와 
평균(avg())를 구하여 출력하는 resulting() 메서드가 있도록 하시오.
 */
public class Student {
	
	String name = "아무개";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	
	int tot() {
		return this.kor+this.eng+this.mat;
	}
	double avg() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	void resulting() {
		System.out.println("이름 : "+this.name+", 총점 : "+this.tot()+" 평균 : "+this.avg());
	}
}