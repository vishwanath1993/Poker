
public class PlayersCard {

	private static final int Integer = 0;
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
		
		/*
		 * if(playerOneCards > playerTwoCards) {
		 * System.out.println("Player 1 is the winner" ); }else {
		 * System.out.println("Player 2 is the winner" ); }
		 */

		// four of a kind player1
		playerOneCards = winner.fourOfaKind(player1);
		// four of a kind player2
		playerTwoCards = winner.fourOfaKind(player2);
		checkWinner(playerOneCards, playerTwoCards);

		// triple player1
		playerOneCards = winner.triple(player1);
		// triple player2
		playerTwoCards = winner.triple(player2);
		checkWinner(playerOneCards, playerTwoCards);

		// flush player1
		playerOneCards = winner.flush(player1);
		// flush player2
		playerTwoCards = winner.flush(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// fullHouse player1
		playerOneCards = winner.fullHouse(player1);
		// fullHouse player2
		playerTwoCards = winner.fullHouse(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// twoPairs player1
		playerOneCards = winner.twoPairs(player1);
		// twoPairs player2
		playerTwoCards = winner.twoPairs(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// pair player1
		playerOneCards = winner.pair(player1);
		// pair player2
		playerTwoCards = winner.pair(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// straightFlush player1
		playerOneCards = winner.straightFlush(player1);
		// straightFlush player2
		playerTwoCards = winner.straightFlush(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// straight player1
		playerOneCards = winner.straight(player1);
		// straight player2
		playerTwoCards = winner.straight(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
		// highCard player1
		playerOneCards = winner.highCard(player1);
		// highCard player2
		playerTwoCards = winner.highCard(player2);
		checkWinner(playerOneCards, playerTwoCards);
		
			}

	private static char retrieveChar(String card) {
		return card.charAt(0);
	}
	
	private static void checkWinner(int playerOneCards, int playerTwoCards) {
		
		if(playerOneCards > playerTwoCards) {
			
			System.out.println("Player 1 is the winner");
		}
	}
	
}
