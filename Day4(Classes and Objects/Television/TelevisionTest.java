import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {

	private Television state;
	
	@Before
	public void setup()
	{
		state = new Television();
		state.setState(true);					//to turn on television before running any test
	}

	@Test
	public void increaseVolumeTest() 
	{
		
		assertEquals(5,state.changeVolume(5));
	}
	
	@Test
	public void decreaseVolumeTest() 
	{
		state.changeVolume(5);      					//sets volume to 5
		assertEquals(3,state.changeVolume(-2));			// volume changed to 3 after decreasing volume by 2 
	}
	
	
	@Test
	public void changeChannelTest() 
	{
		//channel is by default set to 101
		assertEquals(201,state.changeChannel(201));			// channel changed to 201 
	}
	
	@Test
	public void changeChannelTestForInvalidChannel() 
	{
		//channel is by default set to 101 and we have channel upto 299
		assertEquals(101,state.changeChannel(301));			// channel will not change to 301 as it is invalid so it will set to previous value i.e. 101
	}
	
	@Test
	public void turnOffTest() 
	{
			
		assertEquals(false,state.setState(false));			// channel changed to 201 
	}
}
