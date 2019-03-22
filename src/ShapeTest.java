import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
	
	@Test
	public void testShapeToString()
	{
		//THIMBLE: 
		Assert.assertEquals("Shape toString incorrect.", "thimble", Shape.THIMBLE.toString());
		
		//BOOT: 
		Assert.assertEquals("Shape toString incorrect.", "boot", Shape.BOOT.toString());
		
		//RACECAR: 
		Assert.assertEquals("Shape toString incorrect.", "racecar", Shape.RACECAR.toString());
	}
}
