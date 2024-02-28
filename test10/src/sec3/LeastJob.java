package sec3;
//LeastJob : 작업량이 가장 적은 것 부터 진행 
//SRT(Short Remain Time Job) : 남은 시간이 가장 작은 것 부터 진행
//SCJ(Short time Job) : 요구 시간이 가장 작은 것 부터 진행(스케줄링) => 비선점형 
//아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면 
//A		3시간
//B		2시간
//C		4시간
//D		3시간
//E		2시간
//총시간 14시간
//선착순으로 A,B,C,D,E 의 프로세스가 있다.
//SCJ : B -> E -> A -> D -> C
//아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면 
//A		08:00	3시간
//B		09:00	2시간
//C		10:00	4시간
//D		14:00	3시간
//E		14:00	2시간
//총시간 14시간
//8~11  9,11~13 10,13,14    14~16	16~19	14,19~22
//A ->  B ->	C ->		E ->	C ->	-> D		
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되어 다음 상담하실 분 들어오세요");	
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담시간이 가장 적게 걸리는 사람을 우선 배정합니다.");
	}
}
