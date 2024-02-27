package section;

public class City {
	private int code;	//도시코드
	private String name;	//도시명
	private int amount;		//인구수
	private String governor;	//시장 및 도지사 이름
	private String nation;		//소속 국가
	public City() {}
	public City(int code, String name, int amount, String governor, String nation) {
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.governor = governor;
		this.nation = nation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getGovernor() {
		return governor;
	}
	public void setGovernor(String governor) {
		this.governor = governor;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "City [code=" + code + ", name=" + name + ", amount=" + amount + ", governor=" + governor + ", nation="
				+ nation + "]";
	}
}
