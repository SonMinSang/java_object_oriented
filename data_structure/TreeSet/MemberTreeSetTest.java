package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
	
}

public class MemberTreeSetTest {
	public static void main(String[] args) {
		/*
		 * TreeSet<String> set = new TreeSet<String>(); set.add("홍길동"); set.add("강감찬");
		 * set.add("이순신");
		 * 
		 * System.out.println(set);
		 */
//		 MemberTreeSet memberTreeset = new MemberTreeSet();
//		 
//		 Member memberLee = new Member(1001, "이순신"); 
//		 Member memberKim = new Member(1002, "김유신"); 
//		 Member memberKang = new Member(1003, "강감찬");
//		 Member memberHong = new Member(1004, "홍길동");
//		 memberTreeset.addMember(memberLee); 
//		 memberTreeset.addMember(memberKim);
//		 memberTreeset.addMember(memberKang);
//		 
//		 
//		 
//		 memberTreeset.addMember(memberHong); 
//		 memberTreeset.showAllMember(); 
//		 
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
	}
}
