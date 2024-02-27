package section;

public class Tools {
	private int tno;	//도구 번호
	private String name;	//도구 이름
	private String url;		//도구 설치 경로
	private int volume;		//도구 용량
	private int price;		//도구 가격
	public Tools() {}
	public Tools(int tno, String name, String url, int volume, int price) {
		this.tno = tno;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.price = price;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tools [tno=" + tno + ", name=" + name + ", url=" + url + ", volume=" + volume + ", price=" + price
				+ "]";
	}
}
