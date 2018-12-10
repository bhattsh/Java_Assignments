package basics;
import java.util.*;
public class StudentMarks {
	double sub1Marks;
	double sub2Marks;
	double sub3Marks;
	
	void marks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks for subject one :");
		sub1Marks = sc.nextDouble();
		System.out.println("enter marks for subject two is :");
		sub2Marks = sc.nextDouble();
		System.out.println("enter marks for subject three is :");
		sub3Marks = sc.nextDouble();
	}
	
	double total()
	{
		return (this.sub1Marks + this.sub2Marks + this.sub3Marks);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("enter the marks for first student");
		StudentMarks student1 = new StudentMarks();
		student1.marks();
		System.out.println("enter the marks for second student");
		StudentMarks student2 = new StudentMarks();
		student2.marks();
		System.out.println("enter the marks for third student");
		StudentMarks student3 = new StudentMarks();
		student3.marks();
		
		
		
		double sub1Total = student1.sub1Marks + student2.sub1Marks + student3.sub1Marks;
		double sub2Total = student1.sub2Marks + student2.sub2Marks + student3.sub2Marks;
		double sub3Total = student1.sub3Marks + student2.sub3Marks + student3.sub3Marks;
		
		double sub1Average = sub1Total/3;
		double sub2Average = sub2Total/3;
		double sub3Average = sub3Total/3;
		
		double student1Total = student1.total();
		double student2Total = student2.total();
		double student3Total = student3.total();
		
		System.out.println("total of subject one is: "+sub1Total + " and it's average is: "+sub1Average);
		System.out.println("total of subject two is: "+sub2Total + " and it's average is: "+sub2Average);
		System.out.println("total of subject three is: "+sub3Total + " and it's average is: "+sub3Average);
		
		System.out.println("total of first student is: "+student1Total);
		System.out.println("total of second student is: "+student2Total);
		System.out.println("total of third student is: "+student3Total);
		
		System.out.println("average of first student is: "+(student1Total/3));
		System.out.println("average of second student is: "+(student2Total/3));
		System.out.println("average of third student is: "+(student3Total/3));
	}
}
