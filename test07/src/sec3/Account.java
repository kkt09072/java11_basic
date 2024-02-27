package sec3;
//계좌
public class Account {	
	private int accId;		//계좌번호(5자리)
	private String name;	//예금주
	private String bankName;	//금융기관
	private int balance;	//잔액
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [계좌번호:" + accId + ", 예금주=" + name + ", 금융기관명=" + bankName + ", 잔액=" + balance + "]";
	}
}
