package exam;
//Q4. 다음 코드는 오류가 발생합니다. 오류가 발생하는 원인을 설명하세요.
/*

public class Employee {
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
}

public class Engineer extends Employee {
	private String skillset;	
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillset)
		this.skillSet = skillset;	
}
*/
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("1. 기본 생성자가 없음 => 기본 생성자 추가하든지 아래 매개변수가 있는 생성자를 제거하든지 ");
		System.out.println("2. skillSet의 멤버 변수(필드명)이 skillset => skillSet 변경");
		System.out.println("3. setSkillSet 메소드의 중괄호 블록이 없음 => 해당 메소드의 중괄호({}) 블록을 추가");
	}
}