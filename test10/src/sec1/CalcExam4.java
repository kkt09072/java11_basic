package sec1;

public class CalcExam4 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Calcurator cal1;
		
		//메소드의 구현 내용이 없어 인터페이스 생성자로 객체를 생성할 수 없으나
		//메소드의 구현 내용을 별도로 기술하면, 객체를 생성할 수 있음. 
		cal1 = new Calcurator() {
			public int add(int num1, int num2) {
				return num1 + num2;
			}
			public int subtract(int num1, int num2) {
				int su = 0;
				if(num1 > num2) su = num1 - num2;
				else su = num2 - num1;
				return su;
			}
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			}
		}; 
		
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1, num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1, num2));
		System.out.println("곱셈 : "+cal1.multiply(num1, num2));
		System.out.println("나눗셈 : "+cal1.divide(num1, num2));
	}
}
