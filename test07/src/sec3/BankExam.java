package sec3;

import java.util.Scanner;
//10개 까지 은행계좌를 개설할 수 있는 Account의 배열을 선언하여, 은행계좌관리 시스템을 구축하여라
//금융기관(bankName)은 1. 국민은행, 2. 기업은행, 3. 농협은행 으로 한다.
//1. 계좌 등록 : 금융기관명(bankName), 예금주(name), 금액(balance) 등을 입력하여 계좌를 생성한다.
//		만약, 계좌가 10개를 초과하면, 더 이상 계좌를 등록할 수 없다는 메시지를 출력하여 더 이상 계좌를 등록할 수 없도록 해야 함.
//		계좌번호(accId)는 0~9 까지의 정수로 자동 발생하도록 한다.
//2. 입금 처리 : 해당 계좌번호와 입금액을 입력받아 처리한다.
//		만약, 해당 계좌가 없는 경우 새로운 계좌를 등록할 수 있도록 계좌 등록으로 이동한다.
//3. 출금 처리 : 해당 계좌번호와 출금액을 입력받아 처리한다.
//		만약, 해당 계좌가 없는 경우 새로운 계좌를 등록할 수 있도록 계좌 등록으로 이동한다.
//4. 잔액 조회 : 해당 계좌번호를 입력하면, 계좌정보(은행명, 예금주, 계좌번호, 잔액) 등을 출력한다.
//		만약, 해당 계좌가 없는 경우 새로운 계좌를 등록할 수 있도록 계좌 등록으로 이동한다.
//0 : 작업 종료
//1-4 작업은 계속 반복 수행되며, 작업번호 입력시 0을 입력하면, 프로그램을 종료하도록 한다.
public class BankExam {
	public static void main(String[] args) {
		Account[] acc = new Account[10];
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean sw = true;
		int num;
		int money = 0;
		while(sw) {
			System.out.print("작업 번호[1-4] : 1. 계좌 등록, 2. 입금 처리, 3. 출금 처리,"
					+ " 4. 잔액 조회, 0. 작업 종료");
			int job = sc.nextInt();
			switch(job){
				case 1:	
					System.out.println("계좌 등록");
					acc[n] = new Account();
					System.out.print("금융 기관명 : ");
					acc[n].setBankName(sc.next());
					System.out.print("예금주 : ");
					acc[n].setName(sc.next());
					System.out.print("초기입금액 : ");
					acc[n].setBalance(sc.nextInt());
					System.out.println("\n계좌를 새롭게 등록하였습니다.");
					n++;
					break;
				case 2:
					System.out.println("입금 작업");
					System.out.print("입금할 계좌번호 입력 : ");
					num = sc.nextInt();
					if(num>=n) {
						System.out.println("해당 계좌가 존재하지 않습니다. 계좌 등록을 먼저 하시기 바랍니다.");
					} else {
						System.out.print("입금할 금액 입력 : ");
						money = sc.nextInt();
						acc[num].setBalance(acc[num].getBalance()+money);
					}
					break;
				case 3:
					System.out.println("출금 작업");
					System.out.print("출금할 계좌번호 입력 : ");
					num = sc.nextInt();
					if(num>=n) {
						System.out.println("해당 계좌가 존재하지 않습니다. 계좌 등록을 먼저 하시기 바랍니다.\n");
					} else {
						System.out.print("출금할 금액 입력 : ");
						money = sc.nextInt();
						if(acc[num].getBalance()<money) {
							System.out.println("출금할 잔액이 부족합니다.");
						} else {
							acc[num].setBalance(acc[num].getBalance()-money);
							System.out.println(money+"원이 정상적으로 출금되었습니다.");
						}
					}
					break;
				case 4:
					System.out.println("계좌 조회");
					System.out.print("조회할 계좌번호 입력 : ");
					num = sc.nextInt();
					if(num>=n) {
						System.out.println("해당 계좌가 존재하지 않습니다. 계좌 등록을 먼저 하시기 바랍니다.\n");
					} else {
						System.out.println(acc[num].toString());
					}
					break;
				default:
					System.out.println("작업을 종료합니다.");
					sw = false;
			}
		}
	}
}
