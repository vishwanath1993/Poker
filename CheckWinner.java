
public class CheckWinner {

	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };

	// royal Flush
	public int royalFlush(char playersCard) {

		if (playersCard == ranks[8].charAt(0) && playersCard == ranks[9].charAt(0) && playersCard == ranks[10].charAt(0)
				&& playersCard == ranks[11].charAt(0) && playersCard == ranks[12].charAt(0)) {
			System.out.println("Winner is " + playersCard);
			return 1;
		} else {
			return 0;

		}
	}

	// four of a kind
	public int fourOfaKind(String[] playerCards) {
		if (playerCards[0] != playerCards[3] && playerCards[1] != playerCards[4]) {
			return 0;
		} else {
			return 1;
		}
	}

	// checks for triple
	public int triple(String[] playerCards) {
		if (playerCards[0] == playerCards[2] || playerCards[2] == playerCards[4]) {
			return 1;
		}
		return 0;
	}

	// checks for flush
	public int flush(String[] playerCards) {
		for (int count = 1; count < 5; count++) {
			if (playerCards[0] != playerCards[count]) {
				return 0;
			}
		}
		return 1;
	}

}
