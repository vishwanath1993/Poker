
public class PlayersCard {

	private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	public static void splitLinesFromGivenFile(String strline) {
		String[] cards = strline.split(" ");

		String[] player1 = new String[] { cards[0], cards[1], cards[2], cards[3], cards[4] };

		String[] player2 = new String[] { cards[5], cards[6], cards[7], cards[8], cards[9] };

		CheckWinner winner = new CheckWinner();

		// player 1 royal flush
		for (int card = 0; card < 5; card++) {
			winner.royalFlush(retrieveChar(player1[card]));
		}
		// player 2 royal flush
		for (int card = 0; card < 5; card++) {
			winner.royalFlush(retrieveChar(player2[card]));
		}

		// four of a kind player1
		winner.fourOfaKind(player1);
		// four of a kind player2
		winner.fourOfaKind(player2);

		// triple player1
		winner.triple(player1);
		// triple player2
		winner.triple(player2);

		// flush player1
		winner.flush(player1);
		// flush player2
		winner.flush(player2);

	}

	private static char retrieveChar(String card) {
		return card.charAt(0);
	}
}
