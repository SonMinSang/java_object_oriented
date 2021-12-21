package lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNumber myNumber = (x, y)-> x>y ? x : y;
		System.out.println(myNumber.getMax(10 ,6));
	
	}

}
