package section;
//수강과정
public class Course {
	private int cno;	//수강과정코드
	private String name;	//수강과정명
	private int price;		//수강가격
	private int times;		//강의시수
	private String lector;	//강사명
	public Course() {}
	public Course(int cno, String name, int price, int times, String lector) {
		this.cno = cno;
		this.name = name;
		this.price = price;
		this.times = times;
		this.lector = lector;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public String getLector() {
		return lector;
	}
	public void setLector(String lector) {
		this.lector = lector;
	}
	@Override
	public String toString() {
		return "Course [cno=" + cno + ", name=" + name + ", price=" + price + ", times=" + times + ", lector=" + lector
				+ "]";
	}
}
