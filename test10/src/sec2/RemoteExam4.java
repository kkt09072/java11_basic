package sec2;

public class RemoteExam4 {
	public static void main(String[] args) {
		Audio a = new Audio();
		RemoteControl.changeBattery();
		a.turnOn();
		a.setVolume(17);
		a.setMute(true);
		a.setMute(false);
		a.turnOff();
		
	}
}