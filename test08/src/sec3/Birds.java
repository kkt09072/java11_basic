package sec3;

public class Birds extends Animal {
	protected int wings;
	protected boolean fly;
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	@Override
	public String print() {
		return "Birds wings=[" + wings + "], name=["+super.name+"]";
	}
	
}
