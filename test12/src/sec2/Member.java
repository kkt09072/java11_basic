package sec2;

public class Member {
	private int mno;
	private String id;
	private String pw;
	private String name;
	private int point;
	public Member() {}
	public Member(int mno, String id, String pw, String name, int point) {
		super();
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", id=" + id + ", pw=" + pw + ", name=" + name + ", point=" + point + "]";
	}
	
}
