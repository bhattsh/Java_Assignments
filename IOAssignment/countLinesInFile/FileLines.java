package countLinesInFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author shubham bhatt
 *FileLines class checks is used to count the number of lines in a file using LinesInFile() method
 *
 */
public class FileLines {

	/**
	 * linesInFile method returns the number of lines in a file
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public int linesInFile(String file) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(file)); 
		int lines =0;
		
		while(reader.readLine() != null)lines++;
		return lines;
	}

}
