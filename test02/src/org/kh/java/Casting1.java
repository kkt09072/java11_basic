package org.kh.java;
//형 변환1(Auto Casting, Force Casting) = type conversion
public class Casting1 {
	public static void main(String[] args) {
		//Auto Casting(묵시적 형변환)  : 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮겨지면서 타입이 자동으로 변환되는 것
		byte b = 20;	//1byte
		short s = b;	//2byte : byte => short
		int i = s;		//4byte : short => int
		long l = i;		//8byte : int => long
		//Force Casting(명시적 형변환) : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 타입을 변환
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
		int year = 2018;
	}
}
