package TreeSet;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemeberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemeberName() {
		return memberName;
	}
	public void setMemeberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는" + memberId + "입니다.";
	}
	@Override
	public int hashCode() {

		return memberId;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member)(obj);
			if (this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}		
		return false;
	}
//	@Override
//	public int compareTo(Member member) {
//
////		if (this.memberId > member.memberId)
////			return 1;
////		else if (this.memberId < member.memberId)
////			return -1;
////		else
////			return 0;
//		return (this.memberId - member.memberId);
//	}
	@Override
	public int compare(Member member1, Member member2) { //TreeSet 클래스에 뭐로 지정되어 있는지 지정해줘야함
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
	}
}
