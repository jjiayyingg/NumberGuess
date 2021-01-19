package jan19;

import java.util.*;

public class Player {
	private int num;
	private int id;

	public Player(int id) {
		this.id = id;
		guessNum(id);
	}
	
	private void guessNum(int id) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for player "+ id + ":");
		int n = scanner.nextInt();
		this.num = n;
	}
	
	public int getNum () {
		return num;
	}
	
	public int getID() {
		return id;
	}
}
