package MinMax;

public class MinMaxProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {110, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int min = numbers[0];
		int max = numbers[0];
		
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 1; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i;
			}
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i;
			}
		}
		System.out.println("max: "+ max +", index: " + maxPos);
		System.out.println("min: "+ min +", index: " + minPos);
	}

}
