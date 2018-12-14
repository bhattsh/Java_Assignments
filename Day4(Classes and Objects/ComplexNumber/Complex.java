
public class Complex {

	private float real;
	private float imagenary;
	
	public void set(float real, float imagenary)
	{
		this.real = real;
		this.imagenary = imagenary;
	}
	
	public void display()
	{
		System.out.println("complex number is: "+this.real + " + "+ this.imagenary+"i");
	}
	
	public float getReal()
	{
		return this.real;
	}
	
	public float getImagenary()
	{
		return this.imagenary;
	}
	
	public Complex sumOfComplexNumbeer(Complex object1, Complex object2)
	{
		 this.real = object1.real + object2.real;
		 this.imagenary = object1.imagenary + object2.imagenary;
		return this;
	}
}
