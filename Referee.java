package jan19;

public class Referee {
	private int gNum;
	private int p1Num;
	private int p2Num;
	private int p3Num;
	
	public Referee(Guesser g, Player p1, Player p2, Player p3) {
		this.gNum = askGuesser(g);
		this.p1Num = askPlayer(p1);
		this.p2Num = askPlayer(p2);
		this.p3Num = askPlayer(p3);
	}

	private int askGuesser(Guesser guesser) {
		return guesser.getNum();
	}

	private int askPlayer(Player player) {
		return player.getNum();
	}

	public boolean compare(int a, int b) {
		return a == b;
	}
	
	public int getGNum() {
		return gNum;
	}
	
	public int getP1Num() {
		return p1Num;
	}
	
	public int getP2Num() {
		return p2Num;
	}
	
	public int getP3Num() {
		return p3Num;
	}
}
