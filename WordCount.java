import java.io.*;
import acm.program.*;
import acm.util.*;
import java.util.*;
//complete
public class WordCount{
	private static int lines;
	private static int words;
	private static int chars;
	public static void main(String[] args){
		//reads file
		try {
			BufferedReader rd = new BufferedReader(new FileReader("WordCountTest.txt"));
		//while the file is present
		while(true) {
			//read file line by line
			String line = rd.readLine();
			//break if end of file, no more lines
			if(line == null) break;
			//adds to array for each space
			String[] arr = line.split(" ");
			//adds to array for each linebreak
			String[] lineBreaks = line.split("\n");
			//increment word count array for each space
			for(String character: arr) words++;
			//increment lines count for each element in the lineBreaks array
			for(String character: lineBreaks) lines++;
			//counts each character in the file
			for(int i = 0; i < line.length(); i++) {
				char Character = line.charAt(i);
				chars++;
			}
		}
		//close BufferedReader rd
		rd.close();
		}
		//catches thrown exception if WordCountText.txt is missing
		catch(IOException MissingFile) {
			System.out.println("WordCountText.txt not found");
			System.exit(0);
			}
			System.out.println("File: WordCountTest.txt");
			System.out.println("Lines: " + lines);
			System.out.println("Words: " + words);
			System.out.println("Chars: " + chars);
	}
}