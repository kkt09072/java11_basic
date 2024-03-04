package sec2;

public class StringBufferExam {
	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += " Junier Level";
		str += " Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();	//스택(Stack) 구조
		byte[] b = str.getBytes();
		for(byte c:b) {	//문자배열을 문자열로 변경
			char k = (char) c;
			sb.append(k);	//한 문자씩 StringBuffer 추가
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');

		System.out.println(cs.list());	//문자배열로
		System.out.println(cs.toString()+", 글자수 : "+cs.toString().length());	//문자열로
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println("글자수 : "+cs.toString().length());
		
	}
}