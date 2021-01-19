package jan19;

import java.util.Scanner;

public class Guesser {
	private int num;

	public Guesser() {
		guessNum();
	}
	
	private void guessNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for Guesser:");
		int n = scanner.nextInt();
		this.num = n;
	}
	
	public int getNum () {
		return num;
	}
}
