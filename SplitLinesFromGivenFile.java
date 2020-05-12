
public class SplitLinesFromGivenFile {
	
	public static void splitLinesFromGivenFile(String strline) {
		
		String[] cards = strline.split(" ");

		PlayersCard playerCard = new PlayersCard();
		playerCard.playerCards(cards);
		
	}
	

}
