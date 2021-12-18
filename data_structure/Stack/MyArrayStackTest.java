package Stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
