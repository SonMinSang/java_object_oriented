package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		int day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			}
			case 2 -> {
				yield 28;
			}
			case 4, 6, 9, 11 -> {
				yield 30;
			}
			default -> {
	
				System.out.println("not valid");
				yield -1;
			}
		};
		System.out.println(day);
	}
}
