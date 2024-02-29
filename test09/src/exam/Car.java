package exam;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar()
	{
		System.out.println("¼¼Â÷¸¦ ÇÕ´Ï´Ù");
	}

	public void run()
	{
		start();
		drive();
		stop();
		turnOff();
		//washCar();
	}
}