package basics;
import java.util.Scanner;
public class MonthFromDate {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in format(DD,MM,YYYY)");
		String date = sc.next();
		
		String day = date.substring(0,2);
		String year = date.substring(6,10);
		int month = Integer.parseInt(date.substring(3,5));
		
		switch(month)
		{
		case 1:{ 
				System.out.println(day+"/"+"January"+"/"+year);
				break;
				}
		case 2:{ 
				System.out.println(day+"/"+"February"+"/"+year);
				break;
				}
		case 3:{ 
				System.out.println(day+"/"+"March"+"/"+year);
				break;
				}
		case 4:{ 
				System.out.println(day+"/"+"April"+"/"+year);
				break;
				}
		case 5:{ 
			System.out.println(day+"/"+"May"+"/"+year);
			break;
			}
		case 6:{ 
			System.out.println(day+"/"+"June"+"/"+year);
			break;
			}
		case 7:{ 
			System.out.println(day+"/"+"July"+"/"+year);
			break;
			}
		case 8:{ 
			System.out.println(day+"/"+"August"+"/"+year);
			break;
			}
		case 9:{ 
			System.out.println(day+"/"+"September"+"/"+year);
			break;
		}
		case 10:{ 
			System.out.println(day+"/"+"October"+"/"+year);
			break;
		}
		case 11:{ 
			System.out.println(day+"/"+"November"+"/"+year);
			break;
		}
		case 12:{ 
			System.out.println(day+"/"+"December"+"/"+year);
			break;
		}
		default :System.out.println("please enter a valid month");
		}
	}
}
