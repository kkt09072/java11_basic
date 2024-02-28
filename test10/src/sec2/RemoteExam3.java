package sec2;

public class RemoteExam3 {
	public static void main(String[] args) {
		Television tel = new Television();
		
		RemoteControl.changeBattery();
		tel.turnOn();
		tel.setVolume(20);
		tel.setMute(true);
		tel.setMute(false);
		tel.light();
		tel.dark();
		tel.zoomin();
		tel.zoomout();
		tel.turnOff();
	}
}
