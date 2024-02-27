package section;

public class Human {
	private int hno;	//구분코드
	private String name;		//이름
	private int age;	//나이
	private String addr;	//주소
	private String tel;		//연락처
	public Human() {}
	public Human(int hno, String name, int age, String addr, String tel) {
		this.hno = hno;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Human [hno=" + hno + ", name=" + name + ", age=" + age + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
}
