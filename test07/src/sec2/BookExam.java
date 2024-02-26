package sec2;

public class BookExam {
	public static void main(String[] args) {
		//100 개의 Book 배열 선언
		Book[] book = new Book[100];
		/*
		for(int i=0;i<5;i++) {
			book[i] = new Book("책 제목"+i,"저자"+i);
		}
		*/
		book[0] = new Book("자바 프로그래밍 입문", "박은종");
		book[1] = new Book("HTML/CSS", "전은철");
		book[2] = new Book("JAVASCRIPT", "김기태");
		book[3] = new Book("편집 디자인", "이연정");
		book[4] = new Book("REACT", "김민석");
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		}
	}
}
