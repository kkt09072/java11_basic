package sec4;

public class Person {
	private String name;
	private int age;
	private int gender;
	private boolean isMaried;
	private int childAmount;	
	public Person() { }
	public Person(String name, int age, short gender, boolean isMaried, short childAmount) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isMaried = isMaried;
		this.childAmount = childAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public boolean isMaried() {
		return isMaried;
	}
	public void setMaried(boolean isMaried) {
		this.isMaried = isMaried;
	}
	public int getChildAmount() {
		return childAmount;
	}
	public void setChildAmount(int childAmount) {
		this.childAmount = childAmount;
	}
	public void print() {
		System.out.println("이 사람의 나이 : "+age);
		System.out.println("이 사람의 이름 : "+name);
		System.out.print("이 사람의 결혼 여부 : ");
		if(isMaried) {
			System.out.print("기혼\n");
		} else {
			System.out.print("미혼\n");
		}
		System.out.println("이 사람의 자녀 수 : "+childAmount);
	}
}
