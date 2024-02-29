package add;

public class ParseExam {
	public static void main(String[] args) {
		String str = "123";
		//정수로 형 변환
		int i = Integer.parseInt(str);
		System.out.println("정수 : "+i);
		
		str = "123.456";
		//실수로 형 변환
		double d = Double.parseDouble(str);
		System.out.println("실수 : "+d);
		
		char[] ch = {'K','i','m'};
		
		//숫자를 문자열로 변환
		String j = String.valueOf(i);
		String k = String.valueOf(d);
		String r = i + "";		//개발자의 규칙상 어긋나는 행위로 간주됨.
		
		
		//문자배열을 문자열로 변환
		String l = String.valueOf(ch);
		
		
	}
}