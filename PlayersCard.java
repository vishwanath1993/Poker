
public class PlayersCard {

	private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	Card[] hand;
	

	public void playerCards(String[] cards) {
		int playerOneCards =0, playerTwoCards=0 ;
		String[] player1 = new String[] { cards[0], cards[1], cards[2], cards[3], cards[4] };

		String[] player2 = new String[] { cards[5], cards[6], cards[7], cards[8], cards[9] };

		CheckWinner winner = new CheckWinner();

		// player 1 royal flush
		for (int card = 0; card < 5; card++) {
			playerOneCards= winner.royalFlush(retrieveChar(player1[card]));
		}
		// player 2 royal flush
		for (int card = 0; card < 5; card++) {
			playerTwoCards = winner.royalFlush(retrieveChar(player2[card]));
		}
		
		if(playerOneCards > playerTwoCards) {
			System.out.println("Player 1 is the winner");
		}else {
			System.out.println("Player 2 is the winner");
		}

		// four of a kind player1
		playerOneCards = winner.fourOfaKind(player1);
		// four of a kind player2
		playerTwoCards = winner.fourOfaKind(player2);

		// triple player1
		winner.triple(player1);
		// triple player2
		winner.triple(player2);

		// flush player1
		winner.flush(player1);
		// flush player2
		winner.flush(player2);
		
		// fullHouse player1
		winner.fullHouse(player1);
		// fullHouse player2
		winner.fullHouse(player2);
		
		// twoPairs player1
		winner.twoPairs(player1);
		// twoPairs player2
		winner.twoPairs(player2);
	}

	private static char retrieveChar(String card) {
		return card.charAt(0);
	}
}
