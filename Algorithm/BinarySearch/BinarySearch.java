package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {12, 25, 31, 48, 54, 66, 70,93, 95, 108};
		
		int target = 83;
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			if(target == temp) {
				find = true;
				break;
			}
			else if(target < temp) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			mid = (left + right) /2;
			temp = numbers[mid];
		}
		if (find == true) {
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		}
		else System.out.println("찾는 수가 없습니다.");
	}

}
