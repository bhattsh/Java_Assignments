package countLinesInFile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author shubham bhatt
 *FileLinesTest class checks the number of lines in a file using different test cases  
 */
public class FileLinesTest {

	FileLines file;
	
	@Before
	public void setUp()
	{
		file = new FileLines();
	}
	
	@Test
	public void LinesInAFileAreCorrect() 					//test will pass as file contains 3 files
	{
		try {
			assertEquals(3,file.linesInFile("C:/Java_Assignments/IOAssignment/src/countLinesInFile/test_file.txt"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void LinesInAFileAreIncorrect() 		//test will fail as file contains only 3 lines
	{
		FileLines file = new FileLines();
		try {
			assertEquals(4,file.linesInFile("C:/Java_Assignments/IOAssignment/src/countLinesInFile/test_file.txt"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void filePathIsIncorrect() 		//exception will occur as file path is incorrect
	{
		FileLines file = new FileLines();
		try {
			assertEquals(4,file.linesInFile("C:/Java_Assignments/IOAssignment/countLinesInFile/test_file.txt"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fileNameIsIncorrect() 		//exception will occur as file name is incorrect
	{
		FileLines file = new FileLines();
		try {
			assertEquals(4,file.linesInFile("C:/Java_Assignments/IOAssignment/countLinesInFile/tesst_file.txt"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
