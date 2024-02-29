package exam;
//중첩 반복문과 조건문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
/*
   *
  ***
 *****
*******
 *****
  ***
   *
*/
/*
i <= 4	
줄	빈칸	별수 
1	3	1 = 2 * i - 1 
2	2	3
3	1	5
4	0	7
i > 4

			j=1		j=5
			j<i-3	j>i*2-10
			j++		j--
			j1		j2
	j1	j2	i-3		i*2-10
5	1	5   2(1)	0(5~1)
6	2	3	3(1~2)	2(5~3)
7	3	1	4(1~3)	4(5)	

*/
public class Exam5 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			if(i<=4) {
				for(int j=4-i;j>0;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
			} else {
				for(int j1=1;j1<i-3;j1++) {
					System.out.print(" ");
				}
				for(int j2=5;j2>i*2-10;j2--) {	//5	3 1
					System.out.print("*");
				}				
			}
			System.out.println();
		}
	}
}
