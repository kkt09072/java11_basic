package org.kh.java;

public class Variable5 {
	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 97;
		char ch4 = '\u2665';
		//char ch5 = -65;  코드 넘버는 순번이므로 음수값을 가질 수 없다.
		char ch5 = 121; 
		char ch6 = '\u26BD';
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("ch4 : "+ch4);
		System.out.println("ch5 : "+ch5);
		System.out.println("ch6 : "+ch6);
		System.out.println("코드 넘버(번호)");
		System.out.println("ch1 : "+(int)ch1);
		System.out.println("ch2 : "+(int)ch2);
		System.out.println("ch3 : "+(int)ch3);
		System.out.println("ch4 : "+(int)ch4);
		System.out.println("ch5 : "+(int)ch5);
	}
}