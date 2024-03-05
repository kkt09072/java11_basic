package exam;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}
class CarFactory {
	//싱글톤(Singleton) 부분
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	//핵심 풀이 부분
	HashMap<String, Car> carMap = new HashMap<>();
	public Car createCar(String name) {	//자동차 이름을 입력받아 같은 자동차 이름이면, 기존의 자동차를 반환
		if(carMap.containsKey(name)) { //입력받은 자동차 이름이 없으면, 새로운 Car를 생성하여 반환
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
}
public class Exam6 {	//CarTest
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("기태 차");	//기태 차 하나인 Singleton 방식으로 생성
		Car sonata2 = factory.createCar("기태 차");
		System.out.println(sonata1 == sonata2); 	//true
		
		Car avante1 = factory.createCar("성하 차");	//성하 차 하나인 Singleton 방식으로 생성
		Car avante2 = factory.createCar("성하 차");
		System.out.println(avante1 == avante2); 	//true
		
		System.out.println(sonata1 == avante1); 	//false
	}
}
