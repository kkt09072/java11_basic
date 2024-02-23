package sec2;
//Top-Down 방식의 생성자 함수 만들기
public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;
	public News() {
		this(1);
	}
	public News(int bno) {
		this(bno, "뉴스 제목");
	}
	public News(int bno, String title) {
		this(bno, title, "admin");
	}
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "뉴스 내용");
	}
	public News(int bno, String title, String uname, String content) {
		this(bno, title, uname, content, "2024-02-23");
	}
	public News(int bno, String title, String uname, String content, String resdate) {
		this(bno, title, uname, content, resdate, 0);
	}
	public News(int bno, String title, String uname, String content, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
}
