package sec4;

public class PurChase {
	private String no;	//주문 번호
	private String id;	//주문자 아이디
	private String date;	//주문 날짜
	private String name;	//주문자 이름
	private String pno;		//주문 상품 번호
	private String addr;	//배송 주소
	public PurChase() { }
	public PurChase(String no, String id, String date, String name, String pno, String addr) {
		super();
		this.no = no;
		this.id = id;
		this.date = date;
		this.name = name;
		this.pno = pno;
		this.addr = addr;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return " 주문 번호 : " + no + "\n 주문자 아이디 : " + id + "\n 주문 날짜 : " + date + "\n 주문자 이름 : " + name + "\n 주문 상품 번호 : " + pno + "\n 배송 주소 : "
				+ addr;
	}
	
}
