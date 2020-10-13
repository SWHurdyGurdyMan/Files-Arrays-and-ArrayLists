import java.io.*;
import acm.program.*;
import acm.util.*;
import java.util.*;
//complete
public class Histograms {
	public static void main(String[] args) {
		int zeros = -1;
		int tens = -1;
		int twenties = -1;
		int thirties = -1;
		int fourties = -1;
		int fifties = -1;
		int sixties = -1;
		int seventies = -1;
		int eighties = -1;
		int nineties = 0;
		int hundred = -1;
		try 
		{
			//read MidtermScores fil;e
			BufferedReader rd = new BufferedReader(new FileReader("MidtermScores.txt"));
			String line = null;
			//create arraylist for greater flexibility in size
			ArrayList<Integer> scores = new ArrayList<Integer>();
			//read file line by line until no more line
			while ((line = rd.readLine())!= null) {
				//parse line from string to int
				int score = Integer.parseInt(line);
				//check range of current test score
				if(score >= 0 & score <= 9) zeros++;
				if(score >= 10 & score <= 19) tens++;
				if(score >= 20 & score <= 29) twenties++;
				if(score >= 30 & score <= 39) thirties++;
				if(score >= 40 & score <= 49) fourties++;
				if(score >= 50 & score <= 59) fifties++;
				if(score >= 60 & score <= 69) sixties++;
				if(score >= 70 & score <= 79) seventies++;
				if(score >= 80 & score <= 89) eighties++;
				if(score >= 90 & score <= 99) nineties++;
				if(score == 100) hundred++;
				scores.add(score);
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
			System.out.print("00-09: ");
			stars(zeros);
			System.out.print("10-19: ");
			stars(tens);
			System.out.print("20-29: ");
			stars(twenties);
			System.out.print("30-39: ");
			stars(thirties);
			System.out.print("40-49: ");
			stars(fourties);
			System.out.print("50-59: ");
			stars(fifties);
			System.out.print("60-69: ");
			stars(sixties);
			System.out.print("70-79: ");
			stars(seventies);
			System.out.print("80-89: ");
			stars(eighties);
			System.out.print("90-99: ");
			stars(nineties);
			System.out.print("100: ");
			stars(hundred);
			System.exit(0);
		}
	}
	//print star to histogram
	public static void stars(int numberRange) {
		for(int i = 0; i <= numberRange; i++) {
			System.out.print("*");
		}		
		System.out.println("\n");	
	}
}