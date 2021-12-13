package ch11;

public class MakeReporTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeReport builder = new MakeReport();
		String report = builder.getReport();
		
		System.out.println(report);
	}

}
