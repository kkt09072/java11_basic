package exam;

public class Engineer extends Employee {
	private String skillSet;	//2. skillSet의 멤버 변수(필드명)이 skillset => skillSet 변경
	public Engineer() {}
	public Engineer(String name) {
		this(name, "사원");
	}
	public Engineer(String name, String grade) {
		super(name, grade);
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillset) {//3. setSkillSet 메소드의 중괄호 블록이 없음 => 해당 메소드의 중괄호({}) 블록을 추가
		this.skillSet = skillset;
	}
}
