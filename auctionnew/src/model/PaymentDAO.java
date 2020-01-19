package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class PaymentDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private JDatePickerImpl datePicker;
	private Member member;
	ResultSet rs = null;
	
	enum PAYMENT {
		CARD_OWNDER(1),
		CARD_NUMBER(2),
		CARD_EXPIRED(3),
		PASSPORT(4),
		AS_ID(5),
		TYPE(6);
		
		private final int value;
		PAYMENT(int value) { this.value = value; }
		public int value() { return this.value; }
	}
	
	public int payInfoinsert(Payment pay) {
		
		int rows = 0;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into ASPAYMENT values("
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(PAYMENT.CARD_OWNDER.value, pay.getCardown());
			psmt.setInt(PAYMENT.CARD_NUMBER.value, pay.getCardnum());
			psmt.setString(PAYMENT.CARD_EXPIRED.value, pay.getExpire());
			psmt.setString(PAYMENT.PASSPORT.value, pay.getPassport());
			psmt.setString(PAYMENT.AS_ID.value, fetchMemberID());
			psmt.setString(PAYMENT.TYPE.value, pay.getType());
			rows = psmt.executeUpdate();

			if (rows == 0) {
				System.out.println("SQL 문을 확인하세요.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}
	
	public void updateMember(String memberID) {
		if (memberID == null) return;
		this.member.setId(memberID);
	}
	
	private String fetchMemberID() {
		if (member == null) return null;
		return member.getId();
	}
}
