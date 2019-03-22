import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void getColorTest()
	{
		GamePieceAppearance gpa = new GamePieceAppearance(Color.RED, Shape.THIMBLE);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Color.RED, gpa.getColor());
		
		//different Color same Shape
		GamePieceAppearance gpa2 = new GamePieceAppearance(Color.CYAN, Shape.THIMBLE);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Color.CYAN, gpa2.getColor());
		
		//same Color different Shape
		GamePieceAppearance gpa3 = new GamePieceAppearance(Color.CYAN, Shape.RACECAR);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Color.CYAN, gpa3.getColor());
	}
	
	@Test
	public void getShapeTest()
	{
		//THIMBLE
		GamePieceAppearance gpa = new GamePieceAppearance(Color.RED, Shape.THIMBLE);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Shape.THIMBLE, gpa.getShape());
		
		//BOOT
		GamePieceAppearance gpa2 = new GamePieceAppearance(Color.RED, Shape.BOOT);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Shape.BOOT, gpa2.getShape());
		
		//RACECAR
		GamePieceAppearance gpa3 = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals("GamePieceAppearance getColor incorrect", Shape.RACECAR, gpa3.getShape());
	}
}
