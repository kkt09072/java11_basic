package section;

public class Editor {
	private int eno;	//에디터코드
	private String name;	//에디터이름
	private String type;	//편집방식
	private String lang;	//주요 작성하는 프로그래밍언어
	private int price;		//가격
	private int year;		//라이선스 계약 년수
	public Editor() {}
	public Editor(int eno, String name, String type, String lang, int price, int year) {
		this.eno = eno;
		this.name = name;
		this.type = type;
		this.lang = lang;
		this.price = price;
		this.year = year;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Editor [eno=" + eno + ", name=" + name + ", type=" + type + ", lang=" + lang + ", price=" + price
				+ ", year=" + year + "]";
	}
}
