package org.kh.site2;

public class Q4 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));	//false
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));	//true
		System.out.println(result);
		System.out.println(!result);			//false
		
	}
}
