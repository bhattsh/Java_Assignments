package MyClass;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class MyClassTest {

	MyClass objectOne = new MyClass("shubam");
	MyClass objectTwo = new MyClass("shubam bhatt");
	MyClass objectThree = new MyClass("shubh");
	MyClass objectFour = new MyClass("Shubam");
	MyClass objectFive = new MyClass("Shubh");
	
	@Test
	public void serializeArrayListOfObjectsTest() 
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(objectOne);
		arrayList.add(objectTwo);
		arrayList.add(objectThree);
		arrayList.add(objectFour);
		arrayList.add(objectFive);
		
		SerializeAndDeserializeMyClass object = new SerializeAndDeserializeMyClass();
		
		try {
			object.serializeObject(arrayList,"listObject.txt");
			assertEquals(true,true);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void deserializeArrayListOfObjectsTest() 
	{
		
		SerializeAndDeserializeMyClass object = new SerializeAndDeserializeMyClass();
		
		try {
			try {
				object.deserializeObject("listObject.txt");
				assertEquals(true,true);
			} 
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
