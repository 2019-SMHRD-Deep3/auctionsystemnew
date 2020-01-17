package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class ReservationDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4��
	private JDatePickerImpl datePicker;
	private Member member;
	//private MemberManagementService service = new MemberManagementService();
	ResultSet rs = null;
	public int getflightDate(Date value, Date value2, Member m) {
			//Reservation rev = new Resrvation();
		   
		   int rows = 0;
		   String a = value.toString();
		   String[] b = a.split(" ");
		   String[] c = new String[4];
		   c[0] = b[5];
		   c[1] = b[1];
		   c[2] = b[2];
		   c[3] = b[3];
		   a = c[0]+"/" + c[1]+"/" + c[2]+"/" +c[3];
		   String g  = value2.toString();
		   b = g.split(" ");
		   //String[] f = new String[4];
		   c[0] = b[5];
		   c[1] = b[1];
		   c[2] = b[2];
		   c[3] = b[3];
		   g = c[0]+"/" + c[1]+"/" + c[2]+"/" +c[3];
 		   try { // try catch ����ó��
				Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
				conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
				// connection �������̽�����
				String sql = "insert into ASRESERVE(RESERVE_NUM,AS_PRODUCTID,"
						+ "AS_DEPDATE,AS_ARIDATE,AS_DEPARTURE) values (ASREV_REVNUM_SEQ.nextval,?,?,?)";
				psmt = conn.prepareStatement(sql); // 4���� ���� sql���� ��ü�� ����� �غ��ϴ°��� sql�� ���Ͻ�Ŵ
				psmt.setString(1,member.getId());
				psmt.setString(2, a);
				psmt.setString(3, g);
				psmt.setInt(4,27);
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
	  
//	   public String get
}
