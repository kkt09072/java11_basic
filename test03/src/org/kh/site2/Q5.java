package org.kh.site2;

public class Q5 {
	public static void main(String[] args) {
		int num1 = 2;						//0010
		int num2 = 10;						//1010
						//00000000000000000...0010
		System.out.println(num1 & num2);	//0010 -> 2
		System.out.println(num1 | num2);	//1010 -> 10
		System.out.println(num1 ^ num2);	//1000 -> 8
		System.out.println(~num1);	//111.....1101 -> -3
	}
}
