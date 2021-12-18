package Set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashset = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");

		memberHashset.addMember(memberLee);
		memberHashset.addMember(memberKim);
		memberHashset.addMember(memberKang);
	
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashset.addMember(memberHong);
		memberHashset.showAllMember();
	}

}
