package sec5;
//추상체 인터페이스(interface)
public interface Queue {
	void enQueue(String title);	//저장된 데이터의 끝
	String deQueue();	//저장된 데이터의 시작
	int getSize();	//현재 Queue에 저장된 개수
}
