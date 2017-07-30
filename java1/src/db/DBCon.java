package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCon {
	
	
	
	public static void main(String[] args) {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/study";
		String id = "root";
		String pwd = "q3431790";
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver); //
			con = DriverManager.getConnection(url, id, pwd); //연결해
			String sql = "select * from test";
			ps = con.prepareStatement(sql); //쿼리를 적을 수 있는 창을 만든 것까지
			ResultSet rs = ps.executeQuery(); //Ctrl Shift F9와 똑같음. 실행. 근데 보여지는 것도 만들어야 해서 rs에 집어넣는다
			//ps.executeQuery();의 리턴타입이 ResultSet인거 그러니까 대입 가능
//			
//			int i = 0;
//			while(i<10) {
//				System.out.println(i);;
//				i++;
//			}
//			
			while(rs.next()) {
				String num = rs.getString("num"); //int지만 모두 String으로 받을 수 있으므로
				String name = rs.getString("name");
				System.out.println(num + name);
				
			}
			
			sql = "INSERT INTO TEST VALUES(1245, 'f333ff')";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			//executeUpdate는 얘를 ResultSet으로 반환하는 게 아니라, 걍 말 그대로 INSERT
			//그래서 값이 그 갯수로 반환된다. 지금은 1개를 넣었으니 1
			//넘나 어렵다
			//ps는 이미 만들어져 있으니 다시 선언할 필요 없이 값만 넣어주면 됨
			//executeUpdate는갯수로 반환되니까 데이터 타입이 int
			//글자가 기울어진 애들은 static 함수임
			if(result==1) {
				System.out.println("정상");
			}else {
				System.out.println("비정상");
			}
			//내가 1개 넣었으니까 sql에.
			//그러니까 result==1이 제대로 들어간 거지. 잘못 들어가면 0이 나와
		}catch(Exception e) {
			e.printStackTrace(); // = System.out.println(e);
			//이 부분 무조건 try catch 안에 넣어야 함
			//이유는 잘 모른다.... 저 connection 이런 애들이 모두 Exception을 throws 한다는데.....
			//항상 에러가 날 수 있는 애들이라 예외처리해줘야 함 대비대비. 안그러면 컴파일 안돼.
			//함수 명 뒤에 throws Exception 을 쓰면 항상 이 함수 쓸 때 try catch문 안에 넣어야만 컴파일이 됨. 강제야 강제
		}finally {
			//오류나든 제대로 하든 무조건 실행한다 이것은
			try { //여러 문제로 클로즈가 안될 수 있으니까...
				ps.close();
				con.close();				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			ps = null;
			con = null;
			//혹시 문제가 있어서 안 끊기면 이렇게라도 해줘야 삭제가 금방 되겠지
		}
	}

}
