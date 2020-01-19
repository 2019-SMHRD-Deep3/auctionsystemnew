package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class ProductDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4��
	private JDatePickerImpl datePicker;
	Member loginuser=null;
	ResultSet rs = null;
	
	public int getPrice(Product proid) {
		int rows = 0;
		try { // try catch ����ó��
			//PRO_PROID_SEQ
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
			// connection �������̽�����
			String sql = "select AS_PRODUCTPRICE from ASPRODUCT where AS_PRODUCTID = ?";
			psmt = conn.prepareStatement(sql); // 4���� ���� sql���� ��ü�� ����� �غ��ϴ°��� sql�� ���Ͻ�Ŵ
			psmt.setInt(1, proid.getProid());
			
			rows = psmt.executeUpdate(); // ����Ʈ�� ������ ������ ������Ʈ int�� ����. �̰� ���������� ������ ���� �ο찡 �����̵�.

			if (rows == 0) {// 5�� rows
				System.out.println("SQL ���� Ȯ���ϼ���.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
		catch (SQLException e) { // 3���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return rows;
	}
//	public int insert(Product member) {
//		int rows = 0;
//		try { // try catch ����ó��
//			//PRO_PROID_SEQ
//			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
//			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
//			// connection �������̽�����
//			String sql = "select AS_PRODUCTID from ASPRODUCT";
//			psmt = conn.prepareStatement(sql); // 4���� ���� sql���� ��ü�� ����� �غ��ϴ°��� sql�� ���Ͻ�Ŵ
//			psmt.setInt(1, member.getProid());
//			psmt.setString(2, member.getProname());
//			psmt.setInt(3, member.getProprice());
//			psmt.setString(4, member.getBirth());
//			psmt.setString(5, member.getEmail());
//			psmt.setInt(6, member.getSex());
//			rows = psmt.executeUpdate(); // ����Ʈ�� ������ ������ ������Ʈ int�� ����. �̰� ���������� ������ ���� �ο찡 �����̵�.
//
//			if (rows == 0) {// 5�� rows
//				System.out.println("SQL ���� Ȯ���ϼ���.");
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
//		catch (SQLException e) { // 3���� ����
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		return rows;
//	}
//	public Product selectone(Member member) {
//		
//		try { // try catch ����ó��
//			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
//			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
//			// connection �������̽�����
//			String sql = "SELECT * FROM ASPRODUCT WHERE AS_ID=? AND AS_PW = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, member.getId());
//			psmt.setString(2, member.getPw());
//			rs = psmt.executeQuery();
//			
//			
//			
//			if(rs.next()) {
//				//�ش� ID�� PW�� ���� ����� ����
//				String id = rs.getString("AS_ID");
//				String pw = rs.getString("AS_PW");
//				String name = rs.getString("AS_NAME");
//				String email = rs.getString("AS_EMAIL");
//				String birth = rs.getString("AS_BIRTH");
//				int sex = rs.getInt("AS_SEX");
//				
//				loginuser = new Member(id,pw,name,birth,email,sex);
//			}
//			
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
//		catch (SQLException e) { // 3���� ����
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs !=null) rs.close();
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		return loginuser;
//
//	}
	public int getProductid() {
		
		return 0;
	}
}
