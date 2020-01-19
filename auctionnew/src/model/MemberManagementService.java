package model;

import java.util.ArrayList;
import java.util.Date;

public class MemberManagementService {
	private MemberDAO dao = new MemberDAO();
	private ReservationDAO rdao = new ReservationDAO();
	private PaymentDAO pdao = new PaymentDAO();
	
	private String memberID = null;
	
	public interface ServiceCompletion {
		void completion(boolean isSuccessfully);
	}
	
	public boolean memberJoin(Member member) {
		int rows = dao.insert(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void payJoin(Payment pay, ServiceCompletion completion) {
		
		pdao.updateMember(this.memberID);
		
		int rows = pdao.payInfoinsert(pay);
		if (rows == 0) {
			completion.completion(false);
		} else {
			completion.completion(true);
		}
	}

	public Member memberlogin(Member member) {
		Member loginUser = dao.selectone(member);
		
		if (loginUser != null) {
			this.memberID = loginUser.getId();
		}
		
		return loginUser;
	}

	public ArrayList<Member> memberlookup(String id) {
		return dao.selectAll(id);
	}

	public boolean idCheck(Member member) {
		  Member ID = dao.idCheck(member);
	      if (ID == null) {
	         return true;
	      } else {
	         return false;
	      }
	}
}
