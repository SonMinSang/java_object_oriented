package Collection;

public class Member {

	private int memberId;
	private String memberName;
	
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
}
