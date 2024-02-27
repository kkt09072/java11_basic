package sec3;

public class LunchExam {
	public static void main(String[] args) {
		Lunch lunch;
		
		lunch = new Korean();
		lunch.eating("김치찌개");
		
		lunch = new Chinese();
		lunch.eating("깐풍기");
		
		lunch = new Japanese();
		lunch.eating("김치나베");
	}
}