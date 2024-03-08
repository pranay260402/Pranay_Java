package q3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .map(n -> n * n) 
                .sum();

        System.out.println(sum);
	}
}