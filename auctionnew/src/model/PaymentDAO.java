package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class PaymentDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4��
	private JDatePickerImpl datePicker;
	private Member member;
	ResultSet rs = null;
	
	public int payInfoinsert(Payment pay) {
		int rows = 0;
		try { // try catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
			// connection �������̽�����
			String sql = "insert into ASPAYMENT values(?,?,?,?,seq.nextval,?,(select RESERVE_NUM from asreserve where as_productid= ?))";
			psmt = conn.prepareStatement(sql); // 4���� ���� sql���� ��ü�� ����� �غ��ϴ°��� sql�� ���Ͻ�Ŵ
			psmt.setString(1, pay.getCardown());
			psmt.setString(2, pay.getCardnum());
			psmt.setString(3, pay.getExpire());
			psmt.setString(4, pay.getPassport());
			psmt.setString(4, member.getId());
			psmt.setInt(5, pay.getResnum());
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
	
	
}
