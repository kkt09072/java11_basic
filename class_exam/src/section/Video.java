package section;

public class Video {
	private int vno;	//동영상번호
	private String name;	//동영상 이름
	private String url;		//동영상 경로
	private int volume;		//동영상 용량
	private int hori;	//가로 크기
	private int verti;	//세로 크기
	public Video() {}
	public Video(int vno, String name, String url, int volume, int hori, int verti) {
		this.vno = vno;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.hori = hori;
		this.verti = verti;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
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
		return "Video [vno=" + vno + ", name=" + name + ", url=" + url + ", volume=" + volume + ", hori=" + hori
				+ ", verti=" + verti + "]";
	}
}
