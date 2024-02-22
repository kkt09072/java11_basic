package org.kh.app2;
//do~while~
public class Loop5 {
	public static void main(String[] args) {
		int a = 0;
		while(a>10) {
			a++;
			System.out.println("a="+a);
		}
		/* do~while~ : 조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장 */
		do {
			System.out.println("a="+a);
		} while(a>10);
		
		for(int i=10;i>0;i--) {	//역 for문
			System.out.println("i="+i);
		}
		
		int b = 0;
		for(;;) {	//무한 루프
			b++;
			System.out.println("b="+b);
			if(b>=10) break;
		}
		
		int tot = 0;
		for(int j=0;j<=100;j++) {	//0~100 짝수의 합
			if(j%2==1) continue;
			tot+=j;
		}
		System.out.println("tot : "+tot);
		
		int hap = 0;
		for(int k=0;k<=100;k+=2) {
			hap+=k;
		}
		System.out.println("hap : "+hap);
		
	}
}
