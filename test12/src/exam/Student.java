package exam;

public class Student {
	private String no;
	private String name;
	public Student() {}
	public Student(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(no);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.no == std.no) 
				return true;
			else 
				return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return no + ":" + name;
	}
	
}
