import java.io.*;
import acm.program.*;
import acm.util.*;
import java.util.*;
public class Histograms {
	public static void main(String[] args) {
		try 
		{
			BufferedReader rd = new BufferedReader(new FileReader("MidtermScores.txt"));
			String line = null;
			ArrayList<Integer> scores = new ArrayList<Integer>();
			while ((line = rd.readLine())!= null) {
				int score = Integer.parseInt(line);
				scores.add(score);
				System.out.println(scores);
			}
			rd.close();
		}
		catch(IOException MissingFile) 
		{
			System.out.println("MidtermScores.txt not found");
			System.exit(0);
		}
		
		finally 
		{
			System.out.println("00-09: ");
			System.out.println("10-19: ");
			System.out.println("20-29: ");
			System.out.println("30-39: ");
			System.out.println("40-49: ");
			System.out.println("50-59: ");
			System.out.println("60-69: ");
			System.out.println("70-79: ");
			System.out.println("80-89: ");
			System.out.println("90-99: ");
			System.out.println("100: ");
			System.exit(0);
		}
	}
}