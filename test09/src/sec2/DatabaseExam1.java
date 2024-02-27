package sec2;
//추상화 정의/필요성/사용법
public class DatabaseExam1 {
	public static void main(String[] args) {
		Database db;	//객체 선언
		
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board","\'제목10\'",10);
		
		System.out.println("\nMySQL");
		
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board","\'제목11\'",11);
		
		System.out.println("\nMariaDB");
		
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board","\'제목12\'",12);
	}
}
