package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		List<Student> sList = new LinkedList<>();
		
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("강민우");
		s1.setPoint(80);
		sList.add(s1);
		
		Student s2 = new Student(2, "강범준", 100);
		sList.add(s2);
		
		sList.add(new Student(3, "계성우", 90));
		
		sList.add(new Student());
		sList.set(3, new Student(4, "권민지", 95));
		
		System.out.println("번호\t이름\t점수");
		for(Student s:sList) {
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
		}
	}
}