package term1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declarations
		int number;
		System.out.println("Please enter a number between 1 and 10:");
		number = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i % number == 0) {
				System.out.println("*");
			}
		};
	}

}
