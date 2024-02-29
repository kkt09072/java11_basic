package exam;
/*
Q4. MyDate와 Exam4 클래스를 완성해봅니다.
<MyDate 클래스 완성하기>
- day, month, year 변수는 private 으로 선언한다.
- 각 변수의 get, set 메서드를 public으로 만듭니다.
- MyDate(int day, int month, int year) 생성자를 만듭니다.
- public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
- Exam4 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다. 
*/
class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate() { }
	public MyDate(int day, int month, int year){
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isValid() {
		boolean valid = false;
		if(month==2) {
			if(day>0 && day<29) valid = true;
		} else if(month==4 || month==6 || month==9 || month==11) {
			if(day>0 && day<31) valid = true;
		} else {
			if(day>0 && day<32) valid = true;
		}
		return valid;
	}
	public void print() {
		if(this.isValid()) System.out.println("유효한 날짜입니다.");
		else System.out.println("유효하지 않은 날짜입니다.");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2024);
		date1.print();
		MyDate date2 = new MyDate(31, 3, 2024);
		date2.print();
	}
}
