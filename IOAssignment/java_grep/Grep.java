package java_grep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Grep {

	public String grep(String stringToSearch, String path) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = "";
		int countLine = 0;
		
		Map <Integer,String> map = new LinkedHashMap();
		while((line = reader.readLine()) != null)
		{
			countLine++;
			String [] wordsArray = line.split(" ");
		
			for(String word : wordsArray)
			{
				if(word.equals(stringToSearch))
					map.put(countLine, line);    		//if string found then it will be added to the hashMap with its line as a key
			}
		}
		return stringToSearch + " found at line number " + map.keySet() + " and those lines are " +map.values().toString() + " respectively";
	}

}
