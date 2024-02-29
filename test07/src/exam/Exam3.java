package exam;
//Q3. 배열의 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력해보세요
public class Exam3 {
	public static void main(String[] args) {
		int[] obj = new int[5];
		int cnt = 0;
		for(int i=1;i<=10;i++) {//2, 4, 6, 8, 10
			if(i%2==0) {
				obj[cnt] = i; //0->2, 1->4, 2->6, 3->8, 4->10
				cnt++;	//1, 2, 3, 4, 5 
			}
		}
		int tot = 0;
		for(int i=0;i<obj.length;i++) {
			tot+=obj[i];
		}
		System.out.println("1~10 짝수의 합계 : "+tot);
	}
}
