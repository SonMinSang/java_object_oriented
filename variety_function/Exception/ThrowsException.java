package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);

		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		
//		try {
//			test.loadClass("a.txt", "abc");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		} catch (Exception e) {
//		
//		}
		
		try {
		test.loadClass("a.txt", "abc");
		} catch (ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}