package exam;
//중첩 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
/*
    *
   ***
  *****
 *******

*/
/*
i	
줄	빈칸	별수 
1	3	1 = 2 * i - 1 
2	2	3
3	1	5
4	0	7
*/
public class Exam4 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
