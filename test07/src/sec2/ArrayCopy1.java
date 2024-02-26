package sec2;
//얕은 복사 : arr2 = arr1 
//=> arr1과 arr2의 주소가 같아지기 때문에 arr1의 요소 또는 arr2의 요소의 값을 변경하면,
//전부 변경되는 특성을 가진다.
public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] arr1 = {80,70,65,90,85,95,60};
		int[] arr2 = {5,3,8,7,6,4,2};
		int[] arr3;
		System.out.println(arr1);
		System.out.println(arr2);
		//arr2의 내용은 arr1를 복사하여 대입하라.
		arr2 = arr1;	//얕은 복사
		arr3 = arr1;
		System.out.println("arr2");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
		System.out.println("arr3");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(i+":"+arr3[i]);
		}
		System.out.println("arr1, arr2, arr3 의 주소 출력");
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		System.out.println("arr3 : "+arr3);
		arr1[2] = 75;
		System.out.println("arr1");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+":"+arr1[i]);
		}
		System.out.println("arr2");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
		System.out.println("arr3");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(i+":"+arr3[i]);
		}
		
	}
}