package exam08;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DataBaseExam {
	
	public static void main(String[] args) {
		try { //property 방식. 파일을 만들어놓고 그 파일에 있는 값을 읽어들임.
			
			ClassLoader loader = DataBaseExam.class.getClassLoader();
			InputStream fis = loader.getResourceAsStream("db.properties");
			//자바가 읽을 수 있는 걸로 바꿔주는게 InputStream
			Properties prop = new Properties();
			prop.load(fis);
			// =과 엔터로 잘라서 키와 밸류로 나눠준다 (해시맵 형태)
			
			String driver = prop.getProperty("db.driver");
			String url = prop.getProperty("db.url");
			String id = prop.getProperty("db.id");
			String pwd = prop.getProperty("db.pwd");
			
			System.out.println(driver);
			System.out.println(url);
			System.out.println(id);
			System.out.println(pwd);
			
			Class.forName(driver); //리플렉션..............
			Connection con = DriverManager.getConnection(url, id, pwd);
			PreparedStatement ps = con.prepareStatement(""); //걍 Statement는 거의 안 씀. 시큐어코딩....보안...........
			String sql = "select * from user_info";
						
			ResultSet rs = ps.executeQuery(sql); //ResultSet은 메타데이터(컬럼)와 데이터를 가지고 있다.
			List<UserInfo> list = new ArrayList<UserInfo>();
			while(rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUiNum(rs.getInt("uinum"));
				ui.setUiName(rs.getString("uiname"));
				ui.setUiAge(rs.getInt("uiage"));
				ui.setUiAddress(rs.getString("uiaddress"));
				list.add(ui);
				
			}
			
			for(UserInfo ui : list) {
				System.out.print("유저번호 : " + ui.getUiNum());
				System.out.print(", 유저이름 : " + ui.getUiName());
				System.out.print(", 유저나이 : " + ui.getUiAge());
				System.out.print(", 유저주소 : " + ui.getUiAddress());
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
