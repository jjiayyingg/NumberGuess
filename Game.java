package jan19;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {

		// create guesser and ask guesser for number
		Guesser g = new Guesser();

		int playerCount = 3;
		// create 3 players and ask each for number
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);

		// create referee and make him ask guesser and players for their numbers
		Referee r = new Referee(g, p1, p2, p3);

		// find winners and add to winners
		ArrayList<Integer> winners = new ArrayList<Integer>();
		if (r.compare(r.getGNum(), r.getP1Num())) {
			winners.add(1);
		}
		if (r.compare(r.getGNum(), r.getP2Num())) {
			winners.add(2);
		}
		if (r.compare(r.getGNum(), r.getP3Num())) {
			winners.add(3);
		}

		// print winning message for all winners
		if (winners.size() == playerCount) { // all player win
			System.out.println("All players win!");

		} else if (winners.size() > 1) { // more than 1 player wins
			System.out.print("Player " + winners.get(0));
			for (int i = 1; i < winners.size(); i++) {	// loop through all winners and print
				System.out.print(" and " + winners.get(i));
			}
			System.out.print(" wins!");

		} else if (winners.size() == 1) { // only 1 player wins
			System.out.println("Player " + winners.get(0) + " wins!");

		} else { // no player wins -> guesser wins
			System.out.println("Guesser wins!");
		}
	}
}
