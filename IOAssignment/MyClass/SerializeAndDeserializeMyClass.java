package MyClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import employee.Employee;

public class SerializeAndDeserializeMyClass 
{


	public  void serializeObject(List list,String file) throws IOException
	{
		 FileOutputStream fileOut = new FileOutputStream(file); 
		 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 out.writeObject(list); 
		 System.out.println("Object has been serialized");
		 
		 out.close(); 
		 fileOut.close(); 
	}

	public void deserializeObject(String file) throws IOException, ClassNotFoundException 
	{
		
		 FileInputStream fileIn = new FileInputStream(file); 
	     ObjectInputStream in = new ObjectInputStream(fileIn); 
		 
	     
	      // Method for deserialization of object 
	    Object list = (in.readObject());  
	      System.out.println("Object has been deserialized"); 
	      System.out.println(list.toString());
	      in.close(); 
	      fileIn.close(); 
		
	}
}
