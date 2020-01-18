package term1;

import java.util.Scanner;

public class C1_3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 10:");
		int number = sc.nextInt();
		sc.close();
		for(int i=1; i<11; i++) {
			System.out.print(2*i-1);
			if((2*i-1)%number==0) {
				System.out.println("*");
			}else {
				System.out.println();
			};
		};

	}

}
