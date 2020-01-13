package model;

import java.util.ArrayList;

public class MemberManagementService {
	private MemberDAO dao = new MemberDAO();

	public boolean memberJoin(Member member) {
		int rows = dao.insert(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Member memberlogin(Member member) {
		Member i = dao.selectone(member);
		return i;
	}

	public ArrayList<Member> memberlookup(String id) {
		return dao.selectAll(id);
	}
}
