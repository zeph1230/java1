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
			con = DriverManager.getConnection(url, id, pwd); //������
			String sql = "select * from test";
			ps = con.prepareStatement(sql); //������ ���� �� �ִ� â�� ���� �ͱ���
			ResultSet rs = ps.executeQuery(); //Ctrl Shift F9�� �Ȱ���. ����. �ٵ� �������� �͵� ������ �ؼ� rs�� ����ִ´�
			//ps.executeQuery();�� ����Ÿ���� ResultSet�ΰ� �׷��ϱ� ���� ����
//			
//			int i = 0;
//			while(i<10) {
//				System.out.println(i);;
//				i++;
//			}
//			
			while(rs.next()) {
				String num = rs.getString("num"); //int���� ��� String���� ���� �� �����Ƿ�
				String name = rs.getString("name");
				System.out.println(num + name);
				
			}
			
			sql = "INSERT INTO TEST VALUES(1245, 'f333ff')";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			//executeUpdate�� �긦 ResultSet���� ��ȯ�ϴ� �� �ƴ϶�, �� �� �״�� INSERT
			//�׷��� ���� �� ������ ��ȯ�ȴ�. ������ 1���� �־����� 1
			//�ѳ� ��ƴ�
			//ps�� �̹� ������� ������ �ٽ� ������ �ʿ� ���� ���� �־��ָ� ��
			//executeUpdate�°����� ��ȯ�Ǵϱ� ������ Ÿ���� int
			//���ڰ� ������ �ֵ��� static �Լ���
			if(result==1) {
				System.out.println("����");
			}else {
				System.out.println("������");
			}
			//���� 1�� �־����ϱ� sql��.
			//�׷��ϱ� result==1�� ����� �� ����. �߸� ���� 0�� ����
		}catch(Exception e) {
			e.printStackTrace(); // = System.out.println(e);
			//�� �κ� ������ try catch �ȿ� �־�� ��
			//������ �� �𸥴�.... �� connection �̷� �ֵ��� ��� Exception�� throws �Ѵٴµ�.....
			//�׻� ������ �� �� �ִ� �ֵ��̶� ����ó������� �� �����. �ȱ׷��� ������ �ȵ�.
			//�Լ� �� �ڿ� throws Exception �� ���� �׻� �� �Լ� �� �� try catch�� �ȿ� �־�߸� �������� ��. ������ ����
		}finally {
			//�������� ����� �ϵ� ������ �����Ѵ� �̰���
			try { //���� ������ Ŭ��� �ȵ� �� �����ϱ�...
				ps.close();
				con.close();				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			ps = null;
			con = null;
			//Ȥ�� ������ �־ �� ����� �̷��Զ� ����� ������ �ݹ� �ǰ���
		}
	}

}
