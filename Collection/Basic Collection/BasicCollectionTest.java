import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Shubham Bhatt
 *BasicCollectionTest is a test class to test the working of different collections like Set And Map
 */
public class BasicCollectionTest 
{
	private Laptop acer;
	private Laptop hp;
	private Laptop dell;
	
	private Car hondaCity;
	private Car hondaBlaze;
	private Car marutiSuzuki;
	
	private Television lg;
	private Television samsung;
	private Television hyundai;

	private CellPhone mi;
	private CellPhone nokia;
	private CellPhone samsungPhone;

	private School dav;
	private School jnv;
	private School kv;
	
	Student studentOne;
	Student studentTwo;
	Student studentThree;
	Student studentFour;
	
	/**
	 * setup method which create objects before start of every test
	 */
	@Before 
	public void setUp()
	{																	//Objects of Laptop
		acer = new Laptop("acer","2.x","windows","i3");
		hp = new Laptop("hp","2.0","linux","i5");
		dell = new Laptop("dell","2.4","windows","i7");
																		//objects of Car
		 hondaCity = new Car("honda","city",2012,1000000);
		 hondaBlaze = new Car("honda","blaze",2016,12000000);
		 marutiSuzuki = new Car("swift","dezire",2016,800000);
		 																//objects of Television
		lg = new Television("LG","LED", true, 50000);
		samsung = new Television("samsung","LCD", false, 30000);
		hyundai = new Television("hyundai","plasma", true, 20000);
																		//objects of CellPhone	
		mi = new CellPhone("mi","note5","3gb,64gb","lollipop",13000);
		nokia = new CellPhone("nokia","1600","256gb,500mb","lollipop",1000);
		samsungPhone = new CellPhone("samsung","j5","3gb,32gb","kitkat",12000);
																			//Objects of School
		dav = new School("DAV", "Kota", "Kota", 5);
		jnv = new School("JNV", "Udaipur", "Udaipur", 1);
		kv = new School("Kendriya Vidhyalaya", "Jaipur", "Jaipur", 3);
																			//objects of Student
		studentOne = new Student("Shubham");
		studentTwo = new Student("Rohan");
		studentThree = new Student("Tejas");
		studentFour = new Student("Tushar");
	}
	
	
	/**
	 * testWorkingOfHashSet is a test method to test working of hashSet on different Objects
	 */
	@Test
	public void testWorkingOfHashSet()   							
	{
		 Set<Laptop> laptopList = new HashSet<Laptop>();
		 laptopList.add(acer);	
		 laptopList.add(hp);
		 laptopList.add(dell);
		 laptopList.add(dell);	//without overriding hashCode and equals method this duplicate object will also get stored in HashSet 
		 
		 Set<Television> tvList = new HashSet<Television>();
		 tvList.add(lg);	
		 tvList.add(samsung);
		 tvList.add(hyundai);
		 
		 Set<CellPhone> cellPhoneList = new HashSet<CellPhone>();
		 cellPhoneList.add(mi);	
		 cellPhoneList.add(nokia);
		 cellPhoneList.add(samsungPhone);
		 
		 Set<School> schoolList = new HashSet<School>();
		 schoolList.add(dav);	
		 schoolList.add(jnv);
		 schoolList.add(kv);
		 
		 Set<Car> carList = new HashSet<Car>();
		 carList.add(hondaCity);
		 carList.add(hondaBlaze);
		 carList.add(marutiSuzuki);
		 
		 System.out.println(schoolList);
		 System.out.println(cellPhoneList);
		 System.out.println(tvList);
		 System.out.println(laptopList.toString());
	}

	
	/**
	 * test to check if HashSet maintains insertion order or not
	 */
	@Test
	public void insertionOrderCheckWithHashSet()     //hashSet does not maintain insertion order
	{
	
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(studentOne);
		studentSet.add(studentTwo);
		studentSet.add(studentFour);
		studentSet.add(studentThree);
		
		Iterator iterator = studentSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}


	/**
	 * test to sort student type collection in ascending oder using TreeSet
	 */
	@Test
	public void testStudentCollectionUsingTreeSet()     //TreeSet for sorting students in ascending or descending order
	{
		Set<Student> studentSet = new TreeSet<Student>();
		studentSet.add(studentOne);
		studentSet.add(studentTwo);
		studentSet.add(studentFour);
		studentSet.add(studentThree);

		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println("TreeSet "+iterator.next());		//displays sorted tree set of Student
		}
	}
	
	
	/**
	 * test to insert elements in a Map and retrieve firstly values using keys and then all the key value pairs 
	 */
	@Test
	public void individualStudentDetailsTestUsingMap()
	{
		Map<String,String> studentMap = new HashMap<String,String>();
		
		studentOne.setFavoriteFruitUsingMap(studentMap,"apple");
		studentTwo.setFavoriteFruitUsingMap(studentMap, "mango");
		studentThree.setFavoriteFruitUsingMap(studentMap,"banana");
		studentFour.setFavoriteFruitUsingMap(studentMap, "mango");
																	//getting values using key
		System.out.println(studentMap.get("Shubham"));				
		System.out.println(studentMap.get("Rohan"));
		System.out.println(studentMap.get("Tejas"));
		System.out.println(studentMap.get("Tushar"));
																	//getting all key-values using for-each loop 
		for(Entry<String, String> mapValues : studentMap.entrySet())
			System.out.println("name is "+mapValues.getKey() + " favouriteFruit is "+mapValues.getValue());
			
	}
}
