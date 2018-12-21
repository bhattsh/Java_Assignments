package java_grep;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class GrepTest 
{

	private Grep grep;
	
	@Before
	public void setUp()
	{
		grep = new Grep();
	}
	
	
	@Test
	public void test() {
		try {
			String s = grep.grep("Shubham","C:/Java_Assignments/IOAssignment/src/countLinesInFile/test_file.txt");
			System.out.println(s);
			assertEquals("Shubham found at line number [1, 5, 7] and those lines are [Hello Shubham   , Shubham bhatt, Shubham, Shubham] respectively",s);
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
