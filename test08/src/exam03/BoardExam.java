package exam03;

import java.util.ArrayList;
import java.util.List;

/*
3. 게시판(Board) 클래스 작성
	해당 패키지 : exam03
	실행 클래스명(main 함수 포함) : BoardExam	
	일반 클래스명 : Board
	멤버 필드 : 글번호(bno), 제목(title), 작성자(uname), 글내용(content), 작성일(resdate), 읽은횟수(visited) 
	각 멤버 필드는 직접 접근이 되지 않도록 해야 하며, 적절한 데이터 타입을 설정하여 정보 은닉이 될 수 있도록 할 것이며,
	그에 따른 getter/setter 등을 작성하고, 기본 생성자와 모든 멤버 필드 값을 매개변수로 받는 생성자를 작성하시오.

	실행 클래스에는 6개의 글이 생성되고, 이를 ArrayList 또는 배열로 생성하여 저장하며, 
	반드시, 6개의 글을 모두 출력 화면(콘솔 창)에 순서대로 출력될 수 있도록 할 것.
	(board 객체의 각 멤버 필드 값은 임의로 setter 로 저장하든, 키보드로 입력받든 관계없음.)
 */
public class BoardExam {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<Board>();
		for(int i=1;i<=6;i++) {
			Board board = new Board(i, "글제목"+i, "작성자"+i, "글내용"+i, "2024-02-28", 0);
			boardList.add(board);
		}
		System.out.println("번호\t제목\t작성자\t작성일");
		for(Board board : boardList) {
			System.out.println(board.getBno()+"\t"+board.getTitle()+"\t"+board.getUname()+"\t"+board.getResdate());
		}
	}
}
