package term1;
import java.util.Scanner;
public class Week1Homework {

	public static void main(String[] args) {
		String theName;
		char firstLetter;
		int letters;
		Scanner sc = new Scanner(System.in);
		theName = sc.next();
		letters = theName.length();
		letters = letters + 1;
		firstLetter = theName.charAt(0);
		System.out.println("Letters: " + letters + "  " + firstLetter + theName);
	}

}
