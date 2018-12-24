/**
 * 
 * @author Shubham Bhatt
 *	Car class contains details about a car
 */
public class Car 
{
	private String company;
	private String model;
	private int year;
	private double price;

	/**
	 * parameterized constructor
	 * @param company
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String company, String model, int year, double price)
	{
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}


	
	
}
