package MyClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class MyClass implements Serializable
{
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}

	private String name;

	public MyClass(String name) 
	{
		this.name = name;
	}
	
	
}
