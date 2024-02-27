package sec2;
//Mysql 구현체
public class Mysql implements Database {
	final static String DRIVER = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mysql://localhost";
	final static int PORT = 3306;
	final static String ID = "root";
	final static String PW = "1234";
	final static String DB = "company";
	@Override
	public void connect(String url, String port, String id, String pw) {
		System.out.println(url+":"+port+"/login_DB?serverTimezone=UTC/"+DB+";"+pw);
		System.out.println("MySQL 데이터베이스가 성공적으로 연결되었습니다.");
	}
	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			System.out.println("결과셋(저장소) 닫기");
		}
		if(pstmt!=null) {
			System.out.println("데이터베이스를 비활성화");
		}
		if(conn!=null) {
			System.out.println("데이터베이스 연결 종료");
		}
	}
	@Override
	public void select(String tbname, String condition) {
		//select * from tbname condition 출력
		System.out.println("select * from "+tbname+condition);
	}
	@Override
	public void insert(String tbname, String field1, int field2) {
		//insert into tbname values (field2, field1) 출력
		System.out.println("insert into "+tbname+" values ("+field2+", "+field1+")");
		
	}
	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		//update tbname set field1=value1 condition 출력
		System.out.println("update "+tbname+" set "+field1+"="+value1+condition);
	}
	@Override
	public void delete(String tbname, String condition) {
		//delete from tbname condition 출력
		System.out.println("delete from "+tbname+condition);
	}
	
}
