package exam;
//Q2. 알파벳 배열 예제와 같이 각 배열 요소의 값을 소문자에서 대문자로 변환해 출력해보세요
//arr = {'M','e','r','r','y',' ','C','h','r','i','s','t','m','a','s'};
public class Exam2 {
	public static void main(String[] args) {
		char[] arr = {'M','e','r','r','y',' ','C','h','r','i','s','t','m','a','s'};
		char[] obj = new char[arr.length];
		//char obj = arr;
		//System.arraycopy(arr, 0, obj, 0, arr.length);
		//대문자 A : 65, 소문자 a : 97
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
			if(a>=97) {
				obj[i] = (char) (a - 32);
			} else {
				obj[i] = arr[i];
			}
			System.out.print(obj[i]);
		}
	}
}