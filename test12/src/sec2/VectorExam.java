package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("제목1", "내용1", "정도준"));	//추가
		nVector.add(new Notice("제목2", "내용2", "조대신"));
		nVector.add(new Notice("제목3", "내용3", "조우진"));
		nVector.add(new Notice("제목4", "내용4", "최태영"));
		nVector.add(new Notice("제목5", "내용5", "한태역"));
		nVector.add(new Notice("제목6", "내용6", "관리자"));
		
		//글 목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n:nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
		nVector.remove(2);	//인덱스 2인 인스턴스 제거 -> 글 제거
		Notice no = new Notice("제목", "내용", "유정환");
		nVector.set(3, no);	//인스턴스를 인덱스가 3인 곳에 중간에 삽입
		System.out.println("\n편집 후\n");
		System.out.println("제목\t내용\t작성자");
		for(int i=0;i<nVector.size();i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지 되고 있으나 Vector는 내용이 없으면, 메모리에서 자동 제거됨.
	}
}
