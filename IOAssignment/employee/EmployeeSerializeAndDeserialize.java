package employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializeAndDeserialize
{

	public  void serializeObject(Employee employee,String file) throws IOException
	{
		 FileOutputStream fileOut = new FileOutputStream(file); 
		 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 out.writeObject(employee); 
		 System.out.println("Object has been serialized");
		 
		 out.close(); 
		 fileOut.close(); 
          
         
	}
	

	public  void deserializeObject( String file) throws IOException, ClassNotFoundException
	{
		 FileInputStream fileIn = new FileInputStream(file); 
	     ObjectInputStream in = new ObjectInputStream(fileIn); 
		 
	     
	      // Method for deserialization of object 
	      Employee  emp = (Employee)in.readObject();  
	      System.out.println("Object has been deserialized"); 
	      
	      in.close(); 
	      fileIn.close(); 
	}
	
	
	
}
