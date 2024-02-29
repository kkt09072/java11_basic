package exam;

import java.util.ArrayList;
import java.util.List;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle");
	}
}
public class Exam5 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>(); //1. ArrayList 객체 생성
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		/*
		Shape a = new Circle();
		list.add(a);
		
		list.add(new Circle());
		*/
		
		for(Shape s : list) {
			s.draw();	//2.
		}
	}
}
