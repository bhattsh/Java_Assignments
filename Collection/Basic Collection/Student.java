import java.util.HashMap;
import java.util.Map;


public class Student implements Comparable<Student>
{
	String name;

	public Student(String name) {
		this.name = name;
	}
	
	
	/**
	 * overridden method from object class
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public int compareTo(Student o) 
	{
		return this.name.compareTo(o.name);
	}
	
	
	/**
	 * method to set favorite fruit of a student in a map
	 * @param map
	 * @param fruit
	 */
	public void setFavoriteFruitUsingMap(Map<String,String> map,String fruit)
	{
		map.put(this.name,fruit);       			// adding name of calling object as key and fruit as value in hashMap  
	}
	
}
