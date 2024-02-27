package section;

public class Chat {
	private int no;	//채팅방번호
	private String title;	//채팅방이름
	private String msg;		//채팅메시지
	private String time;	//채팅작성일시
	private int cnt;		//채팅방인원수
	private int read;		//읽은인원수
	public Chat() {}
	public Chat(int no, String title, String msg, String time, int cnt, int read) {
		this.no = no;
		this.title = title;
		this.msg = msg;
		this.time = time;
		this.cnt = cnt;
		this.read = read;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
	@Override
	public String toString() {
		return "Chat [no=" + no + ", title=" + title + ", msg=" + msg + ", time=" + time + ", cnt=" + cnt + ", read="
				+ read + "]";
	}
	
}
