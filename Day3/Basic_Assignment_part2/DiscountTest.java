import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountTest {

	private NewPriceAfterDiscount price;
	
	@Before
	public void setUp()
	{
		price = new NewPriceAfterDiscount();
	}
	@Test
	public void testNewPrice() {
		assertEquals(700, price.calculateNewPrice(2000),0);
	}

}
