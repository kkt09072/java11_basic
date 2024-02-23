package sec1;

public class OverloadEx2 {
	public static void main(String[] args) {
				
		/* 교재 관리자가 교재를 3권을 등록 */
		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("정보처리 기사");
		b1.setPrice(42000);
		b1.setAuthor("김기태");
		b1.setPub("한빛미디어");
			
		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("자바 프로그래밍 입문");
		b2.setPrice(25000);
		b2.setAuthor("박은종");
		b2.setPub("이지스퍼블리싱");
		
		Book b3 = new Book();
		b3.setBno(103);
		b3.setBname("HTML/CSS 웹 표준");
		b3.setPrice(28000);
		b3.setAuthor("전은철");
		b3.setPub("정보문화사");
		
		Book b4 = new Book();
		b4.print();
		b4.print(b1.getBname(), b1.getPrice(), b1.getAuthor());
		b4.print(b2.getBname(), b2.getPrice(), b2.getAuthor());
		b4.print(b3.getBname(), b3.getPrice(), b3.getAuthor());
	}
}
