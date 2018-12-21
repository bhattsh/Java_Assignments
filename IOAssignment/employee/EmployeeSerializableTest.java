package employee;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class EmployeeSerializableTest {

	Employee employeeOne = new Employee(1,"shubham",100000);
	
	
	@Test
	public void objectWriteTest() 
	{ 
		EmployeeSerializeAndDeserialize serialize = new EmployeeSerializeAndDeserialize();
		try 
		{
			serialize.serializeObject(employeeOne,"store_employee.txt");
			assertEquals(true,true);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
         
	}

	@Test
	public void objectReadTest() 
	{
		EmployeeSerializeAndDeserialize deserialize = new EmployeeSerializeAndDeserialize();	
		
			try {
				deserialize.deserializeObject("store_employee.txt");
				assertEquals(true,true);
			}
			catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
		
	}

}
