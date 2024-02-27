package sec2;
//추상체
public interface Database {
	void connect(String url, String port, String id, String pw);
	void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
	void select(String tbname, String condition);
	void insert(String tbname, String field1, int field2);
	void update(String tbname, String field1, int value1, String condition);
	void delete(String tbname, String condition);
}
