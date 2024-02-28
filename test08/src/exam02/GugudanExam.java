package exam02;
/*
2. 아래와 같이 이중(중첩) for문을 활용하여 구구단(2단~9단)을 한 화면(콘솔 창)에 출력하는 프로그램을 작성하시오.
	해당 패키지 : exam02
	실행 클래스명(main 함수 포함) : GugudanExam	

	구구단

	2x1=2	3x1=3	4x1=4	..............	9x1=9
	2x2=4	3x2=6	................	............
	.............................................
	.......................................	9x9=81
 */
public class GugudanExam {
	public static void main(String[] args) {
		System.out.println("***** 구구단 *****\n");
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%dx%d=%d\t",j,i,j*i);
				//System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
			//System.out.print("\n");
			//System.out.printf("%n");
		}
	}
}
