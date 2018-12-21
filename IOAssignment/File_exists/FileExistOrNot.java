import java.io.File;

/**
 * 
 * @author Shubham Bhatt
 *FileExistOrNot class checks if a file exist or not using checkifExist method
 *
 */
public class FileExistOrNot {

	/**
	 * checkIfExist method return true if a file exist else returns false
	 * @param file
	 * @return
	 */
	public boolean checkIfExist(String file) {
		File fileObject = new File(file);
		return fileObject.exists();
		
	}
}
