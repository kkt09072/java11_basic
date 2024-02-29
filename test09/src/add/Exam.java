package add;

public class Exam {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		Bus b2 = new Bus();
		System.out.println(Bus.MAX);
		Bus.MAX = 200;
		System.out.println(Bus.MAX);
		b1.MAX = 300;
		System.out.println(b2.MAX);
		
		
	}
}
