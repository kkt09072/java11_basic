package sec2;
//RemoteControl 으로 선언하여 RemoteControl, Screen, Television, Audio로 형 변환 하여 활용하기
public class RemoteExam5 {
	public static void main(String[] args) {
		RemoteControl r;	//RemoteControl 객체 선언
		
		r = new RemoteControl() {	//RemoteControl 로 형 변환
			int volume;
			public void turnOff() { System.out.println("기기 전원 OFF");}
			public void turnOn() { System.out.println("기기 전원 ON"); }
			public void setVolume(int volume) {
				if(volume > MAX) this.volume = RemoteControl.MAX;
				else if(volume < MIN) this.volume = RemoteControl.MIN;
				else this.volume = volume;
			}
		};
		
		r = new Screen() {	//Screen 으로 형 변환
			int volume;
			int lightness;
			int zoom;
			
			public void turnOff() { System.out.println("기기 전원 OFF");}
			public void turnOn() { System.out.println("기기 전원 ON"); }
			public void setVolume(int volume) {
				if(volume > MAX) this.volume = RemoteControl.MAX;
				else if(volume < MIN) this.volume = RemoteControl.MIN;
				else this.volume = volume;
			}
			
			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness < 0) this.lightness++;
				return this.lightness;
			}

			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness < 0) this.lightness--;
				return this.lightness;
			}

			public int zoomin() {
				System.out.println("50% 확대");
				if(zoom>=-500 && zoom<=500)	zoom+=50;
				return zoom;
			}

			public int zoomout() {
				System.out.println("50% 축소");
				if(zoom>=-500 && zoom<=500)	zoom-=50;
				return zoom;
			}
		};
		
		r = new Television();
		
		r = new Audio();
	}
}