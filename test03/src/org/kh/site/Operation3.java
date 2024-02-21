package org.kh.site;
//대입 연산 : =, +=, -=, *=, /=, %=
public class Operation3 {
	public static void main(String[] args) {
		int a = 0;
		a += 8;	//a = a + 8	=> 8
		System.out.println("1. a="+a);
		a -= 3;	//a = a - 3 => 5
		System.out.println("2. a="+a);
		a *= 5;	//a = a * 5 => 25
		System.out.println("3. a="+a);
		a /= 4; //a = a / 4 => 6
		System.out.println("4. a="+a);
		a %= 2; //a = a % 2 => 0
		System.out.println("5. a="+a);
	}
}
