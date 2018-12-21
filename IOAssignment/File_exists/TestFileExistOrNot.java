import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Shubham Bhatt
 *TestFileExistOrNot is a JUnit test class which test if a file exist or not
 */
public class TestFileExistOrNot {

	@Test
	public void FileExistTest() {
		FileExistOrNot file = new FileExistOrNot();
		assertEquals(true,file.checkIfExist("C:/Users/sbhatt1/Downloads/Java Assignment/RE__Collection,_Streams_and_Lambda_Expressions_and_Assignments/assignments_io.txt"));
	}

	@Test
	public void FileNotExistTest() {
		FileExistOrNot file = new FileExistOrNot();
		assertEquals(false,file.checkIfExist("C:/Users/sbhatt1/Downloads/Java Assignment/RE__Collection,_Streams_and_Lambda_Expressions_and_Assignments/NewFile.txt"));
	}
	

	@Test
	public void FileExistTestWhenFilePathIsIncorrect() 		//test will fail as file path is incorrect
	{
		FileExistOrNot file = new FileExistOrNot();
		assertEquals(true,file.checkIfExist("C:/Users/sbhatt/Downloads/Java Assignment/RE__Collection,_Streams_and_Lambda_Expressions_and_Assignments/assignments_io.txt"));
	}
	
	

	@Test
	public void FileExistTestWhenFileNameIsIncorrect() 		//test will fail as file name is incorrect
	{
		FileExistOrNot file = new FileExistOrNot();
		assertEquals(true,file.checkIfExist("C:/Users/sbhatt1/Downloads/Java Assignment/RE__Collection,_Streams_and_Lambda_Expressions_and_Assignments/assignmentsio.txt"));
	}
}
