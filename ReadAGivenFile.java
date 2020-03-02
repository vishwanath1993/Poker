import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAGivenFile {

	private BufferedReader bufferedReader;

	public void readFileContent() {
		try {
			bufferedReader = new BufferedReader(new FileReader(new File("C:\\Users\\QR824ME\\Desktop\\Poker.txt")));

			while (true) {
				if (bufferedReader.readLine() == null) {
					System.out.println("File reading finsihed");
					break;
				}
				System.out.println(bufferedReader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
