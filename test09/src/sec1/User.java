package sec1;

public abstract class User { //추상 클래스 : 단 하나의 메소드라도 추상화 메소드가 있음.
	protected String ip;
	protected int port;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	public abstract void connect();	//추상 메소드 : 메소드의 기능 구현 내용을 기술하지 않고, 선언만 
}