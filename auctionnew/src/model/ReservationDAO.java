package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class ReservationDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4번
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
 		   try { // try catch 예외처리
				Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
				conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
				// connection 인터페이스구조
				String sql = "insert into ASRESERVE(RESERVE_NUM,AS_PRODUCTID,"
						+ "AS_DEPDATE,AS_ARIDATE,AS_DEPARTURE) values (ASREV_REVNUM_SEQ.nextval,?,?,?)";
				psmt = conn.prepareStatement(sql); // 4번의 과정 sql문을 객체를 만들어 준비하는과정 sql을 리턴시킴
				psmt.setString(1,member.getId());
				psmt.setString(2, a);
				psmt.setString(3, g);
				psmt.setInt(4,27);
				rows = psmt.executeUpdate(); // 셀렉트를 제외한 문장은 업데이트 int에 리턴. 이걸 실행했을때 영향을 받은 로우가 리턴이됨.

				if (rows == 0) {// 5번 rows
					System.out.println("SQL 문을 확인하세요.");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 클래스 객체를 생성해서 메모리에 올려줌
			catch (SQLException e) { // 3번의 과정
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (psmt != null)
						psmt.close();
					if (conn != null)
						conn.close();
					// 닫다가 예외가 발생할수 있기때문에 얘네도 트라이 캐치로 묶어준다.
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   return rows;
	   }
	  
//	   public String get
}
