package section;

public class Tire {
	private int no;		//순번
	private String maker;	//제조사
	private String type;	//타입
	private int amount;		//수량
	private int size;		//크기
	public Tire() {}
	public Tire(int no, String maker, String type, int amount, int size) {
		this.no = no;
		this.maker = maker;
		this.type = type;
		this.amount = amount;
		this.size = size;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Tire [no=" + no + ", maker=" + maker + ", type=" + type + ", amount=" + amount + ", size=" + size + "]";
	}
}
