package sec3;

public class SingletonExam {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		System.out.println((ins1==ins2)+":"+(ins1==ins3));
	}
}

