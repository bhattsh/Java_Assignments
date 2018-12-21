package words_in_a_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsInFile 
{
	public int numberOfWords(String file) throws IOException
	{
		int numberOfWords =0;
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String lineOfFile;
		while((lineOfFile = reader.readLine())!= null)
		{
			if(!lineOfFile.equals(""))
			{
				String [] wordsArray = lineOfFile.split(" ");
					numberOfWords = numberOfWords + wordsArray.length;
			
				for(String word : wordsArray)
					System.out.println(word);
			}
		}
		
		System.out.println(numberOfWords);
		return numberOfWords;
	}
}
