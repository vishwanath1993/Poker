
public class CheckWinner {
	
	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };
	Card[] hand;

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
	
	// checks for full house
	public int fullHouse(String[] playerCards) {
		int comparison = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (playerCards[counter - 1] == playerCards[counter]) {
				comparison++;
			}
		}
		if (comparison == 3) {
			return 1;
		} else {
			return 0;
		}
	}
		
	// checks for two pairs
	public int twoPairs(String[] playerCards) {
		int check = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (playerCards[counter - 1] == playerCards[counter]) {
				check++;
			}
		}
		if (check == 2) {
			return 1;
		} else {
			return 0;
		}
	}
	

	// check for pair
		public int pair(String[] playerCards)
		{
			int check = 0;
			for(int counter = 1; counter < 5; counter++)
			{
				if (playerCards[counter - 1] == playerCards[counter])
				{
					check++;
				}
			}
			if (check == 1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		
	// checks for a straight flush
	public int straightFlush(String[] playerCards)
	{

		String suitTexts = "HCSD";
		int suitCode = suitTexts.indexOf(playerCards[0].charAt(1));

		for (int counter = 1; counter < 5; counter++) {
			if (playerCards[0] + suitCode != playerCards[counter] + suitCode) {
				return 0;
			}
		}
		/*
		 * for (int counter2 = 1; counter2 < 5; counter2++) { if (playerCards[counter2 -
		 * 1] != (playerCards[counter2] - 1)) { return 0; }
		 * 
		 * }
		 */
		return 1;

	}

	// check for straight
	public int straight(String[] playerCards) {
		for (int counter2 = 1; counter2 < 5; counter2++) {
			if (playerCards[counter2 - 1].charAt(0) != (playerCards[counter2].charAt(0) - 1)) {
				return 0;
			}

		}
		return 1;
	}
		
		// find highest card
		public int highCard(String[] playerCards)
		{
			int highCard = 0;
			for (int counter = 0; counter < 5; counter++)
			{
				if (playerCards[counter].charAt(0) > highCard)
				{
					highCard = playerCards[counter].charAt(0);
				}
			}
			return highCard;
		}
	

}
