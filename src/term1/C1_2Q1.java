package term1;
import java.util.Scanner;
public class C1_2Q1 {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int lettersInName = name.length();
		char firstLetter = name.charAt(0);
		System.out.println(lettersInName);
		System.out.println(name);
		System.out.println(firstLetter);
	}

}
