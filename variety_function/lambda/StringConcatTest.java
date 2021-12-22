package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		StringConcat concat = (s,v)->System.out.println(s + ",," + v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "...." + s2);
			}
		};
		concat2.makeString(s1, s2);
	}

}
