package sec2;

public class StringExam1 {
	public static void main(String[] args) {
		String name1 = "김기태";
		String name2 = new String("김기태");
		Integer su1 = 1004;
		String su2 = "1004";
		//String su3 = new String(su1);
		String su3 = String.valueOf(su1);	//※ 문자열로 변경
		System.out.println("su1 equals su2 : "+su1.equals(su2));
		System.out.println("su2 equals su3 : "+su2.equals(su3)); //※ 문자열 및 객체 비교
	
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");	//※ 문자열 분리
		for(String s:names) {
			System.out.println(s);
		}
		String str2 = String.join("/", names);	//※ 문자열 합치기
		System.out.println(str2);
		
		String data = "   ivE\'s beaUty grOup\nnewJeans is girlGroup Top  ";
		
		char ten = data.charAt(9);	//10번째 문자(인덱스가 9인 문자)
		System.out.println("10번째 문자(인덱스가 9인 문자) : "+ten);
		String trimData = data.trim();	//앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println("앞 뒤의 공백을 제거 : "+trimData.length()+"글자, "+trimData);
		int size = data.trim().length();	//글자수를 size에 저장
		System.out.println("앞 뒤 공백을 제거한 글자수 : "+size);
		int n = data.indexOf('n');	//첫 번째 n의 글자 위치(인덱스)를 n 에 저장
		System.out.println("첫 번째 n의 글자 위치(인덱스)를 n 에 저장 : "+n);
		int n2 = data.lastIndexOf('n');	//마지막 n의 글자 위치(인덱스)를 n 에 저장
		System.out.println("마지막 n의 글자 위치(인덱스)를 n 에 저장 : "+n2);
		String up = data.toUpperCase();	//모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환하여 up에 저장 : "+up);
		String down = data.toLowerCase();	//모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환하여 down에 저장 : "+down);
		String sub1 = data.substring(22,30);	//※ 공백을 제거하고, 22번째 글자 부터 29번째만 추출하여 sub1에 저장
		System.out.println("공백을 제거하고, 22번째 글자 부터 29번째만 추출하여 sub1에 저장 : "+sub1);
		String sub2 = data.replace("newJeans", "Kepler");	//newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println("newJeans의 단어를 Kepler로 변경하여 sub2에 저장 : "+sub2);
		byte[] girl = data.trim().getBytes();	//※ 문자열을 girl 문자(byte)배열로 변환하여 저장
		System.out.println("글자 수 : "+girl.length);
		for(byte b:girl) {
			char k = (char) b;
			System.out.println(k);
		}
		String girlgroup = data.substring(data.lastIndexOf('g'),data.lastIndexOf('g')+9);	//girl의 g의 마지막 위치부터 9 문자를 추출하여 저장
		girlgroup = girlgroup + " " + sub1;
		System.out.println(girlgroup);
		//문자(byte)배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl);
		System.out.println(str4);
	}
}
