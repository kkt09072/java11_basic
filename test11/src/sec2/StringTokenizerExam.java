package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {
	public static void main(String[] args) {
		String names = "장인범,김민아,김민석,이희훈,이예린,이연정"; //구분기호(delim)를 토큰이라고 함.
		String anis = "개의새끼 \f 소의새끼 \n 말의새끼 \t 꿩의새끼 \r 쥐의새끼";
		System.out.println(anis);
		//출력 제어 문자와 같은 것은 토큰을 기재하지 않아도 자동으로 토큰으로 간주
		StringTokenizer st = new StringTokenizer(anis);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		//특정 문자가 토큰인 경우
		StringTokenizer sk = new StringTokenizer(names, ",");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken().trim());
		}		
	}
}