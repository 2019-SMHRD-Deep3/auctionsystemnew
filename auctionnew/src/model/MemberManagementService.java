package model;

import java.util.ArrayList;
import java.util.Date;

public class MemberManagementService {
	private MemberDAO dao = new MemberDAO();
	private ReservationDAO rdao = new ReservationDAO();
	private PaymentDAO pdao = new PaymentDAO();
	public boolean memberJoin(Member member) {
		int rows = dao.insert(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	public boolean payJoin(Payment pay) {
		int rows = pdao.payInfoinsert(pay);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
//	public boolean depDate(Resevation member) {
//		int rows = rdao.getdepDate(member);
//		if (rows == 0) {
//			return false;
//		} else {
//			return true;
//		}
//	}
//	public boolean airDate(Resevation member) {
//		int rows = rdao.getariDate(member);
//		if (rows == 0) {
//			return false;
//		} else {
//			return true;
//		}
//	}

	public Member memberlogin(Member member) {
		Member loginuser = dao.selectone(member);
		return loginuser;
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
