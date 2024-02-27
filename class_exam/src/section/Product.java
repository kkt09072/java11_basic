package section;

public class Product {
	private int pno;	//제품번호
	private String name;	//제품명
	private String cate;	//카테고리명
	private int price;		//제품단가
	private String url;		//제품이미지 경로
	private int amount;		//수량
	public Product() { }
	public Product(int pno, String name, String cate, int price, String url, int amount) {
		this.pno = pno;
		this.name = name;
		this.cate = cate;
		this.price = price;
		this.url = url;
		this.amount = amount;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", cate=" + cate + ", price=" + price + ", url=" + url
				+ ", amount=" + amount + "]";
	}
}
