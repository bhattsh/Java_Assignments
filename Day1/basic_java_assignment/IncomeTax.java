package basics;
import java.util.*;
public class IncomeTax {
	
	public static void main(String []args)
	{	
		int i;
		float tax;
		float ctc[] = new float[4];
		Scanner sc = new Scanner(System.in);
		for(i=0;i<4;i++)
		{
		System.out.println("enter CTC for slab "+ i);
		ctc[i] = sc.nextInt();
		}
		
		for(i=0;i<ctc.length;i++)
		{
			if(ctc[i]<180000)
				System.out.println("No income tax for slabA with CTC "+ ctc[i]);
			else if(ctc[i]>180000 && ctc[i]<300000)
			{
				tax = (ctc[i]*10)/100;
				System.out.println("tax for slabB with CTC " + ctc[i] + " is " + tax );
			}
			else if(ctc[i]>300000 && ctc[i]<500000)
			{
				tax = (ctc[i]*20)/100;
				System.out.println("tax for slabC with CTC " + ctc[i] + " is " + tax);
			}
			else
			{
				tax = (ctc[i]*30)/100;
				System.out.println("tax for slabD with CTC " + ctc[i] + " is " + tax);
			}
				
		}
	}

}
