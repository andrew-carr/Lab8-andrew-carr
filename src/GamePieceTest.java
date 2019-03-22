import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void getColorTest()
	{
		//RED_RACER
		Assert.assertEquals("GamePiece getColor incorrect", Color.RED, GamePiece.RED_RACER.getColor());
		
		//BLUE_RACER
		Assert.assertEquals("GamePiece getColor incorrect", Color.BLUE, GamePiece.BLUE_RACER.getColor());
		
		//MAGENTA_RACER
		Assert.assertEquals("GamePiece getColor incorrect", Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor());
		
		//RED_THIMBLE
		Assert.assertEquals("GamePiece getColor incorrect", Color.RED, GamePiece.RED_THIMBLE.getColor());
		
		//BLUE_BOOT
		Assert.assertEquals("GamePiece getColor incorrect", Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		
		//GREEN_BOOT
		Assert.assertEquals("GamePiece getColor incorrect", Color.GREEN, GamePiece.GREEN_BOOT.getColor());
		
		//YELLOW_BOOT
		Assert.assertEquals("GamePiece getColor incorrect", Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());
	}
	
	@Test
	public void getShapeTest()
	{
		//RED_RACER
		Assert.assertEquals("GamePiece getShape incorrect", Shape.RACECAR, GamePiece.RED_RACER.getShape());
				
		//BLUE_RACER
		Assert.assertEquals("GamePiece getShape incorrect", Shape.RACECAR, GamePiece.BLUE_RACER.getShape());
				
		//MAGENTA_RACER
		Assert.assertEquals("GamePiece getShape incorrect", Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape());
				
		//RED_THIMBLE
		Assert.assertEquals("GamePiece getShape incorrect", Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());
				
		//BLUE_BOOT
		Assert.assertEquals("GamePiece getShape incorrect", Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
				
		//GREEN_BOOT
		Assert.assertEquals("GamePiece getShape incorrect", Shape.BOOT, GamePiece.GREEN_BOOT.getShape());
				
		//YELLOW_BOOT
		Assert.assertEquals("GamePiece getShape incorrect", Shape.BOOT, GamePiece.YELLOW_BOOT.getShape());
	}
	
	@Test
	public void movesFirstTest()
	{
		//no two pieces have same priority
		
		//first argument lower priority (first argument is returned)
		Assert.assertEquals("GamePiece movesFirst incorrect", GamePiece.RED_RACER,
				GamePiece.movesFirst(GamePiece.RED_RACER, GamePiece.GREEN_BOOT));
		
		//second argument lower priority (second argument is returned)
		Assert.assertEquals("GamePiece movesFirst incorrect", GamePiece.RED_RACER,
				GamePiece.movesFirst(GamePiece.GREEN_BOOT, GamePiece.RED_RACER));
	}
	
	@Test
	public void toStringTest()
	{
		Assert.assertEquals("GamePiece toString incorrect", "RED_RACER: a RED racecar with priority 0",
				GamePiece.RED_RACER.toString());
	}
}
