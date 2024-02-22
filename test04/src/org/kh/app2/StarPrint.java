package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {
	public static void main(String[] args) {
		
		
		/* 1번.
		 
		 ****** 
		 ******
		 ******
		 ******
		  
		*/
		
		System.out.println("01번. ");
		for(int i=0;i<4;i++) { //0	1	2	3 => 4
			for(int j=0;j<6;j++) {//0~5	=> 6
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/* 2번.
		 
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		  
		*/
		
		System.out.println("02번. ");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 3번
		
		 ******
		 *****
		 ****
		 *** 
		 ** 
		 *
		 
		*/
		
		System.out.println("03번. ");
		for(int i=6;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("03-1번. ");
		for(int i=1;i<=6;i++) {
			for(int j=0;j<7-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 4번
		
		 ******
		  *****
		   ****
		    ***
		     **
		      *
		 
		*/
		
		System.out.println("04번. ");
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print(" ");	// 왼쪽부터 늘어나는 공백 구현
			}
			for(int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 5번.
 
		     *
		    **
		   ***
		  **** 
		 ***** 
		******
 
		 */
		
		System.out.println("05번. ");
		for(int i = 1; i < 7; i++) {
			for(int j = 6; j > i ; j--) {
				System.out.print(" ");	// 왼쪽부터 줄어드는 공백 구현
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 6번.

		*
		**
		***
		****
		*****
		******
		*****
		****
		***
		**
		*
		 
		*/
		
		System.out.println("06번. ");
		for(int i = 1; i <= 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 6; i++) {		// 아래로 갈수록 줄어드는 별 구현(4개부터 실행)
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 7번

		******
		*****
		****
		***
		**
		*
		**
		***
		****
		*****
 		******
 
		*/
		
		System.out.println("07번. ");
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= 6; i++) {		// 아래로 갈수록 늘어나는 별 구현(2개부터 실행)
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		/*
		8번.
		    *
		   **
		  ***
		 ****
		*****
	   ******
		*****
		 ****
		  ***
		   **
		    *
 
		 */
		
		System.out.println("08번. ");
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/*
 		9번.
		    *
		   ***
		  *****
		 *******
		*********
 
		 */
		
		System.out.println("09번. ");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");		// 별이 두개씩 늘어나야함
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		10번.  
		  
		*********
		 *******
		  *****
		   ***
		    *
		  
		 */
		
		System.out.println("10번. ");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 1; j < i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j--) {
				System.out.print("*");		// 별이 두개씩 늘어나야함
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/*
		11번.  
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    * 
		  
		 */
		
		
		System.out.println("11번. ");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 10; i+=2) {
			for(int j = 0; j < i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 8; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		12번.

		***** *****
		****   ****
		***     ***
		**       **
		*         *
		**       **
		***     ***
		****   ****
		***** *****
		
		*/
		
		System.out.println("12번. ");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 9; i+=2) {
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			for(int j = 8; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}