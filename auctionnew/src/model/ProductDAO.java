package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class ProductDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4번
	private JDatePickerImpl datePicker;
	Member loginuser=null;
	ResultSet rs = null;
	
	public int getPrice(Product proid) {
		int rows = 0;
		try { // try catch 예외처리
			//PRO_PROID_SEQ
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
			// connection 인터페이스구조
			String sql = "select AS_PRODUCTPRICE from ASPRODUCT where AS_PRODUCTID = ?";
			psmt = conn.prepareStatement(sql); // 4번의 과정 sql문을 객체를 만들어 준비하는과정 sql을 리턴시킴
			psmt.setInt(1, proid.getProid());
			
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
//	public int insert(Product member) {
//		int rows = 0;
//		try { // try catch 예외처리
//			//PRO_PROID_SEQ
//			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
//			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
//			// connection 인터페이스구조
//			String sql = "select AS_PRODUCTID from ASPRODUCT";
//			psmt = conn.prepareStatement(sql); // 4번의 과정 sql문을 객체를 만들어 준비하는과정 sql을 리턴시킴
//			psmt.setInt(1, member.getProid());
//			psmt.setString(2, member.getProname());
//			psmt.setInt(3, member.getProprice());
//			psmt.setString(4, member.getBirth());
//			psmt.setString(5, member.getEmail());
//			psmt.setInt(6, member.getSex());
//			rows = psmt.executeUpdate(); // 셀렉트를 제외한 문장은 업데이트 int에 리턴. 이걸 실행했을때 영향을 받은 로우가 리턴이됨.
//
//			if (rows == 0) {// 5번 rows
//				System.out.println("SQL 문을 확인하세요.");
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 클래스 객체를 생성해서 메모리에 올려줌
//		catch (SQLException e) { // 3번의 과정
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//				// 닫다가 예외가 발생할수 있기때문에 얘네도 트라이 캐치로 묶어준다.
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
//		try { // try catch 예외처리
//			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
//			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
//			// connection 인터페이스구조
//			String sql = "SELECT * FROM ASPRODUCT WHERE AS_ID=? AND AS_PW = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, member.getId());
//			psmt.setString(2, member.getPw());
//			rs = psmt.executeQuery();
//			
//			
//			
//			if(rs.next()) {
//				//해당 ID와 PW를 가진 사람이 존재
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
//		} // 클래스 객체를 생성해서 메모리에 올려줌
//		catch (SQLException e) { // 3번의 과정
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs !=null) rs.close();
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//				// 닫다가 예외가 발생할수 있기때문에 얘네도 트라이 캐치로 묶어준다.
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
