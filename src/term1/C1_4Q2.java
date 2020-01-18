package term1;

import java.util.concurrent.ThreadLocalRandom;

public class C1_4Q2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(sum <= 400) {
			int randomNum = ThreadLocalRandom.current().nextInt(5, 10 + 1);
			sum += randomNum;
			System.out.print(randomNum + ", ");
			i++;
		};
		System.out.println();
		System.out.print("Total: " + i);
	}

}
