package sec2;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] arr1 = {80,70,65,90,85,95,60};
		int[] arr2 = {5,3,8,7,6,4,2};
		int[] arr3 = {5,3,8,7,6,4,2};
		int[] arr4 = {5,3,8,7,6,4,2};
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		arr2 = arr1;	//얕은 복제
		for(int i=0;i<arr1.length;i++) {	//1:1전달 => 깊은 복제
			arr3[i] = arr1[i];
		}
		//System.arraycopy(원본배열, 원본시작위치, 복사배열, 복사시작위치, 개수);
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr1[2] = 75;
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("\narr1");
		System.out.println(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+":"+arr1[i]);
		}
		System.out.println("\narr2");
		System.out.println(arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
		System.out.println("\narr3");
		System.out.println(arr3);
		for(int i=0;i<arr3.length;i++) {
			System.out.println(i+":"+arr3[i]);
		}
		System.out.println("\narr4");
		System.out.println(arr4);
		for(int i=0;i<arr4.length;i++) {
			System.out.println(i+":"+arr4[i]);
		}
	}
}