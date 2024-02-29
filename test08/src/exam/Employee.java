package exam;

public class Employee {
	public String name;
	public String grade;
	public Employee() { }	//1. 기본 생성자가 없음 => 기본 생성자 추가하든지 아래 매개변수가 있는 생성자를 제거하든지
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
}
