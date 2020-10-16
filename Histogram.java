
import java.io.*;

public class Histogram {

	private static final String FILE_NAME = "MidtermScores.txt";
	private static int[] hArray;
	
	public static void main (String[] args) {
		initHArray();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
			while(true) {
				String currentLine = reader.readLine();
				if(currentLine == null) break;
				int score = Integer.parseInt(currentLine);
				if(score < 0 || score > 100) {
					throw new Exception("Out of range.");
				} else {
					int range = score / 10;
					hArray[range]++;
				}
			}
			} catch(Exception e) {
				System.out.println("Error reading file.");
			}
		printHistogram();
	}
	private static void initHArray() {
		hArray = new int[11];
		for(int i = 0; i <= 10; i++) {
			hArray[i] = 0;
		}
	}
	private static void printHistogram() {
		for(int i = 0; i <= 10; i++) {
			String label;
			switch(i) {
			case 0: label = "00-09"; break;
			case 10: label = "  100"; break;
			default:
				label = (10 * i) + "-" + (10 * i + 9);
				break;
			}
			String stars = createStars(hArray[i]);
			System.out.println(label + ": " + stars);
		}
	}
	private static String createStars(int starsNum) {
		String stars = "";
		for(int j = 0; j < starsNum; j++) {
			stars += "*";
		}
		return stars;
	}
}
