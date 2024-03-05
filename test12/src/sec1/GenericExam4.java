package sec1;
class Point<T, V> {	//좌표점 제네릭
	T x;	//x축에서의 (가로) 위치
	V y;	//y축에서의 (세로) 위치
	//public Point() {}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
public class GenericExam4 {
	//제네릭 메소드 : 해당 클래스에 메소드로 반환타입에 관계없이 활용할 수 있는 메소드
	//public [static] <인자1, 인자2> 반환타입 메소드명(매개변수타입 매개변수,...) { }
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width*height;
	}
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(20, 20.0);
		
		double area = GenericExam4.<Integer, Double> makeRectangle(p1, p2); //GenericExam4.<Integer, Double> 생략 가능
		System.out.println("사각형의 면적 : "+area);
	}
}
