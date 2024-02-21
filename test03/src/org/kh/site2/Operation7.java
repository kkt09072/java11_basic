package org.kh.site2;
//대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, |=, >>=, <<=, >>>=, ^=
//비트 연산자 : &(and), |(or), ~(complement), ^(xor), >>(>>>, right shift), <<(left shift)
public class Operation7 {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;
		a += b;		//a=35, b=15
		b -= a;		//a=35, b=-20
		System.out.println("a="+a);
		System.out.println("b="+b);
		//a와 b의 값을 맞교환
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("******** 교환 후 ********");
		System.out.println("a="+a);
		System.out.println("b="+b);

		//비트(2진수) 연산
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x="+Integer.toBinaryString(x));
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x & y : "+Integer.toBinaryString(x & y)); //and
		System.out.println("x | y : "+Integer.toBinaryString(x | y)); //or
		System.out.println("x ^ y : "+Integer.toBinaryString(x ^ y)); //xor
		System.out.println("~x : "+Integer.toBinaryString(~x)); //not
		System.out.println("x >> 2 : "+Integer.toBinaryString(x >> 2)); //right shift
		System.out.println("x << 2 : "+Integer.toBinaryString(x << 2)); //left shift
		System.out.println("********** 대입 연산자 ***********");
		
		//16 8 4 2 1
		   
		int i = 25;	//1 1 0 0 1
		int j = 30; //1 1 1 1 0
		i &= j;	// i = i & j
		System.out.println("i &= j : "+i); // 1 1 0 0 0 => 24
		i = 25;
		i |= j; // i = i | j
		System.out.println("i |= j : "+i); // 1 1 1 1 1 => 31
		i = 25;
		i ^= j; //i = i ^ j
		System.out.println("i ^= j : "+i); // 0 0 1 1 1 => 7
		
		j >>= 2;  //1 1 1 1 0 0 0
		System.out.println("j >>= 2 : "+j);
		j = 30;
		j <<= 2;
		System.out.println("j <<= 2 : "+j);
		j = 30;
		j >>>= 2;
		System.out.println("j >>>= 2 : "+j);
	}
}