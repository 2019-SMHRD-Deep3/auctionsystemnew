package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class MemberDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4번
	private JDatePickerImpl datePicker;
	ResultSet rs = null;
	
	
	public int insert(Member member) {
		int rows = 0;
		try { // try catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
			// connection 인터페이스구조
			String sql = "insert into ASMEMBER values(?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql); // 4번의 과정 sql문을 객체를 만들어 준비하는과정 sql을 리턴시킴
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getName());
			psmt.setString(4, member.getBirth());
			psmt.setString(5, member.getEmail());
			psmt.setInt(6, member.getSex());
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

	public Member selectone(Member member) {
		Member loginuser = null;
		try { // try catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
			// connection 인터페이스구조
			String sql = "SELECT * FROM ASMEMBER WHERE AS_ID=? AND AS_PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			rs = psmt.executeQuery();
			
			
			
			if(rs.next()) {
				//해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("AS_ID");
				String pw = rs.getString("AS_PW");
				String name = rs.getString("AS_NAME");
				String email = rs.getString("AS_EMAIL");
				String birth = rs.getString("AS_BIRTH");
				int sex = rs.getInt("AS_SEX");
				
				loginuser = new Member(id,pw,name,birth,email,sex);
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
				if(rs !=null) rs.close();
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

		return loginuser;

	}

	public ArrayList<Member> selectAll(String login_id) {
		ArrayList<Member> list = new ArrayList<>();
		//Member loginuser = null;
		try { // try catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc같은경우 회사마다 이름이 다르다.
			conn = DriverManager.getConnection(url, user, password); // 3번의 과정 마우스 우클릭후 add catch
			// connection 인터페이스구조
			String sql = "SELECT * FROM MEMBER WHERE USER_ID !=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login_id);
			//psmt.setString(2, member.getPw());
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				//해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString(1);
				String pw = rs.getString(5);
				String name = rs.getString(4);
				int age = rs.getInt(2);
				int sex = rs.getInt(3);
				
				list.add(new Member(id))  ;
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
				if(rs !=null) rs.close();
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

		return list;
	}
	// 중복 확인
	   public Member idCheck(Member m) {
	      Member ID = null;
	      
	      try { // try ~ catch 예외처리 
	         Class.forName("oracle.jdbc.driver.OracleDriver"); 
	         
	         conn = DriverManager.getConnection(url,user, password); 
	         
	         // 일반유저 테이블 확인
	         String sql = "SELECT * FROM asmember " +
	                  "WHERE AS_ID = ?"; 
	         psmt = conn.prepareStatement(sql);  
	         psmt.setString(1, m.getId());
	         
	         rs = psmt.executeQuery();  // 실행
	         
	         if(rs.next()) {  // rs.next()  -> 다음 줄이 있는지 없는지 T/F 로 알려줌
	            // 해당 ID와 PW를 가진 사람이 존재
	            String id = rs.getString("AS_ID");
	            ID = new Member(id);
	            
	         }
	         
	         
	     
	         
	         
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	      
	      catch (SQLException e) {
	         e.printStackTrace();
	         
	      } finally { 
	         try {
	            if(rs != null) rs.close();
	            if(psmt !=null) psmt.close();
	            if(conn!= null) {
	               conn.close();
	            }
	         } catch (SQLException e) {
	            
	            e.printStackTrace();
	         } 
	      }
	      
	      return ID;
	   }
	   
}
