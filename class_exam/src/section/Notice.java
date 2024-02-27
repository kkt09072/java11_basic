package section;

public class Notice {
	private int no;		//글번호
	private String title;	//글제목
	private String content;	//글내용
	private String author;	//작성자
	private String resdate;	//작성일
	private int cnt;		//읽은횟수
	public Notice() {}
	public Notice(int no, String title, String content, String author, String resdate, int cnt) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
		this.resdate = resdate;
		this.cnt = cnt;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Notice [no=" + no + ", title=" + title + ", content=" + content + ", author=" + author + ", resdate="
				+ resdate + ", cnt=" + cnt + "]";
	}
	
}
