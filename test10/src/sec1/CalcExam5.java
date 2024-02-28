package sec1;

public class CalcExam5 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 3;
		
		Repeator rep1;
		
		rep1 = new Repeator() {
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			}
			int power(int num1, int num2) {
				int tmp = num1;
				for(int i=1;i<num2;i++) { 
					num1 = num1 * tmp;
				}
				return num1;
			}
		};
		
		System.out.println("원주율 : "+rep1.PI);
		System.out.println("덧셈 : "+rep1.add(num1, num2));
		System.out.println("뺄셈 : "+rep1.subtract(num1, num2));
		System.out.println("곱셈 : "+rep1.multiply(num1, num2));
		System.out.println("나눗셈 : "+rep1.divide(num1, num2));
		System.out.println("거듭제곱 : "+rep1.power(num1, num2));
	}
}
