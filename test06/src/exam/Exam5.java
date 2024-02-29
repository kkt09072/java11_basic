package exam;
/*
Q5. 아침 출근길에 김씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 이씨는 콩다방에서
4,500원을 내고 라떼를 사 마셨습니다. 객체 간 협력을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요

사람(Human) 
	이름(name), 지불액(money) 
	사람이 특정 돈(money)를 지불하고, 별다방에서 구매 : buyStarCafe(StarCafe sCafe, int money)
	사람이 특정 돈(money)를 지불하고, 콩다방에서 구매 : buyBeanCafe(BeanCafe bCafe, int money)
별다방(StarCafe) :  
	지불액(money) 
	지불액에 따라 메뉴에서 선택하여 구매 : brewing(money)
콩다방(BeanCafe) : 지불액에 따라 메뉴에서 선택하여 구매
	지불액(money)
	지불액에 따라 메뉴에서 선택하여 구매 : brewing(money) 
메뉴(Menu) : 공유 대상(객체 간 협력 대상) 
	STARAMERICANO(4000), STARLATTE(4300), STARMACCHIATO(4500), 
	BEANAMERICANO(4100), BEANLATTE(4500), BEANMACCHIATO(4800)
*/
class Menu {
	final static int STARAMERICANO = 4000;
	final static int STARLATTE = 4300;
	final static int STARMACCHIATO = 4500;
	final static int BEANAMERICANO = 4100;
	final static int BEANLATTE = 4500;
	final static int BEANMACCHIATO = 4800;
}
class Human {
	String name;
	int money;
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void buyStarCafe(StarCafe sCafe, int money){
		String msg = sCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + "님이 "+money+"원을 지불하여 "+msg);
		}
	}
	public void buyBeanCafe(BeanCafe bCafe, int money){
		String msg = bCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + "님이 "+money+"원을 지불하여 "+msg);
		}
	}
}
class StarCafe {
	int money;
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "별 다방에서 아메리카노 구매";
		} else if(money == Menu.STARLATTE) {
			return "별 다방에서 라떼 구매";
		} else if(money == Menu.STARMACCHIATO) {
			return "별 다방에서 마끼아또 구매";
		} else {
			return null;
		}
	}
}
class BeanCafe {
	int money;
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방에서 아메리카노 구매";
		} else if(money == Menu.BEANLATTE) {
			return "콩 다방에서 라떼 구매";
		} else if(money == Menu.BEANMACCHIATO) {
			return "콩 다방에서 마끼아또 구매";
		} else {
			return null;
		}
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Human h = new Human("김기태",30000);
		
		StarCafe sCafe = new StarCafe();
		BeanCafe bCafe = new BeanCafe();
		
		h.buyStarCafe(sCafe, 4000);
		h.buyBeanCafe(bCafe, 4500);
		System.out.println(h.name+"님의 잔액은 "+h.money+"원 입니다.");
	}
}
