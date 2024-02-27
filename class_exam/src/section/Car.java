package section;

public class Car {
	private String cno;	//차량번호
	private int year;	//연식
	private String model;	//모델명
	private int cc;		//배기량
	private String type;	//차량 유형
	private int price;		//가격
	public Car() {}
	public Car(String cno, int year, String model, int cc, String type, int price) {
		this.cno = cno;
		this.year = year;
		this.model = model;
		this.cc = cc;
		this.type = type;
		this.price = price;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [cno=" + cno + ", year=" + year + ", model=" + model + ", cc=" + cc + ", type=" + type + ", price="
				+ price + "]";
	}
	
}
