package words_in_a_file;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WordsInAFileTest {

	private WordsInFile countWords;
	@Before
	public void setUp()
	{
		countWords = new WordsInFile();
	}
	
	@Test
	public void wordsInAFileTest()
	{
		try {
			assertEquals("Shubham",countWords.numberOfWords("C:/Java_Assignments/IOAssignment/src/countLinesInFile/test_file.txt"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
