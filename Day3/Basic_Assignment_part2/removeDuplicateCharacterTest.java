import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class removeDuplicateCharacterTest {

	private RemoveDuplicateCharacter removeCharacter;
	
	@Before
	public void setUp()
	{
		removeCharacter = new RemoveDuplicateCharacter();
	}
	
	@Test
	public void duplicateCharacterRemoved() {
		assertEquals("shubam",removeCharacter.removeDuplicateChararcter("shubham"));
	}

}
