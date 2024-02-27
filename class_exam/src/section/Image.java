package section;

public class Image {
	private int ino;	//이미지코드
	private String name;	//이미지 이름
	private String url;		//이미지 경로
	private int volume;		//이미지 용량
	private int hori;	//가로 크기
	private int verti;	//세로 크기
	public Image() { }
	public Image(int ino, String name, String url, int volume, int hori, int verti) {
		this.ino = ino;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.hori = hori;
		this.verti = verti;
	}
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
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
	public int getHori() {
		return hori;
	}
	public void setHori(int hori) {
		this.hori = hori;
	}
	public int getVerti() {
		return verti;
	}
	public void setVerti(int verti) {
		this.verti = verti;
	}
	@Override
	public String toString() {
		return "Image [ino=" + ino + ", name=" + name + ", url=" + url + ", volume=" + volume + ", hori=" + hori
				+ ", verti=" + verti + "]";
	}
	
}
