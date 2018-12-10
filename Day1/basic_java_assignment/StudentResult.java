package basics;

public class StudentResult {

	public static void main(String [] args)
	{
		float math =95,chemistry =85, physics = 90;
		
		if(math >60 && chemistry>60 && physics>60)
			System.out.println("passed");
		else if((math>60 && chemistry>60) || (math>60 && physics>60) && (chemistry>60 && physics>60))
			System.out.println("promoted");
		else
			System.out.println("failed");
	}
}
