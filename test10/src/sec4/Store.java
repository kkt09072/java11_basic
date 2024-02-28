package sec4;
//다중 상속 안됨
//Pay 클래스에서 public class Pay extends Inventory { }
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
}
