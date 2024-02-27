package section;

public class Sound {
	private int sno;	//사운드 번호
	private String name;	//사운드 이름
	private String type;	//사운드 종류
	private String url;		//사운드 경로
	private int volume;		//사운드 용량
	public Sound() { }
	public Sound(int sno, String name, String type, String url, int volume) {
		this.sno = sno;
		this.name = name;
		this.type = type;
		this.url = url;
		this.volume = volume;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
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
	@Override
	public String toString() {
		return "Sound [sno=" + sno + ", name=" + name + ", type=" + type + ", url=" + url + ", volume=" + volume + "]";
	}
	
}
