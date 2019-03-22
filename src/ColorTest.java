import org.junit.Assert;
import org.junit.Test;

public class ColorTest {
	
	@Test
	public void testColorValues()
	{
		Color col = null;
		
		//RED:
		col = Color.RED;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getB());
		
		//GREEN:
		col = Color.GREEN;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getB());
		
		//BLUE:
		col = Color.BLUE;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getB());
		
		//YELLOW:
		col = Color.YELLOW;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getB());
		
		//CYAN:
		col = Color.CYAN;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getB());
		
		//MAGENTA:
		col = Color.MAGENTA;
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect RGB Value in color" + col.name(), 255, col.getB());
	}
}
