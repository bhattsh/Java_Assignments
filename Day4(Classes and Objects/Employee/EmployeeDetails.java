
public class EmployeeDetails {

	private final int id;
	private String name;
	private double monthlyBasic;
	private double hra;
	private static double medicalAllowance = 1250;
	private static double conveyanceAllowance = 800;
	private static double PF = 10;
	
	
	 public EmployeeDetails(int id)   //Constructor to initialize final member variable id
	 {
		this.id = id;
	 }
	 
	 									//getter and setter methods
	public int getId() {
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getMonthlyBasic() 
	{
		return monthlyBasic;
	}
	
	public void setMonthlyBasic(double monthlyBasic)
	{
		this.monthlyBasic = monthlyBasic;
	}
	

	public void setPF(int pfValue)
	{
		this.PF = pfValue;
	}
	
	public double getPF()
	{
		return this.PF;
	}
	
											//other methods 

	public double getAnnualBasic()
	{
		double annualBasic = 0;
		if(this.monthlyBasic >-1)
		{
		 annualBasic = this.monthlyBasic*12;
		}
		return annualBasic;
	}
	
	public double calculatePF()
	{

		if(((this.monthlyBasic*this.PF)/100)<6500)
		{
			return ((this.monthlyBasic*50)/100);
		}
		
		else
			return 6500;
	}
	
	
	public double getHRA()
	{
			return ((this.monthlyBasic*50)/100);
	}
	
	public double getMonthlyGrossSalary()
	{
		System.out.println(this.monthlyBasic + this.getHRA() + this.medicalAllowance + this.conveyanceAllowance);
		return (this.monthlyBasic + this.getHRA() + this.medicalAllowance + this.conveyanceAllowance) ;
	}
	
	public double annualGrossSalary()
	{
		return getMonthlyGrossSalary()*12;
	}
	
	public double calculateESIC()
	{
		if(this.monthlyBasic < 5000)
			return (this.monthlyBasic*4.75)/100;
		
		return 0;
	}
	
	public int getProfessionalTax()
	{
		double monthlyGross = this.getMonthlyGrossSalary();
		int professionalTax = (monthlyGross <= 10000)?50:100;
		
		return professionalTax;
	}
	
	public double getMonthlyDeduction()
	{
		System.out.println(this.calculatePF() + this.calculateESIC() + this.getProfessionalTax());
		return (this.calculatePF() + this.calculateESIC() + this.getProfessionalTax());
	}
	
	public double getMonthlyTakeHome()
	{
		System.out.println("total  money you will take home per month is :"+(this.getMonthlyGrossSalary() - this.getMonthlyDeduction()));
		return this.getMonthlyGrossSalary() - this.getMonthlyDeduction();
	}
	
	public double getAnnualTakeHome()
	{
		System.out.println("total annual money you will take home is: "+this.getMonthlyTakeHome()*12);
		return this.getMonthlyTakeHome()*12;
	}

}
